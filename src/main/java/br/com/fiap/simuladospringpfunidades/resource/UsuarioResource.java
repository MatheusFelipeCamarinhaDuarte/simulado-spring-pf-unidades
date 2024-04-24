package br.com.fiap.simuladospringpfunidades.resource;

import br.com.fiap.simuladospringpfunidades.dto.request.UsuarioRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.UsuarioResponse;
import br.com.fiap.simuladospringpfunidades.entity.Pessoa;
import br.com.fiap.simuladospringpfunidades.entity.Tipo;
import br.com.fiap.simuladospringpfunidades.entity.Usuario;
import br.com.fiap.simuladospringpfunidades.service.PessoaService;
import br.com.fiap.simuladospringpfunidades.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource implements ResourceDTO<UsuarioRequest, UsuarioResponse>{

    @Autowired
    private UsuarioService service;
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public Collection<UsuarioResponse> findAll(
            @RequestParam(name = "username", required = false) String username,
            @RequestParam(name = "pessoaID", required = false) Long pessoaID,
            @RequestParam(name = "nome", required = false) String nome,
            @RequestParam(name = "sobrenome", required = false) String pessoaSobrenome,
            @RequestParam(name = "dtnasci", required = false) LocalDate pessoaDtNasci,
            @RequestParam(name = "tipo", required = false) Tipo pesosaTipo,
            @RequestParam(name = "email", required = false) String pessoaEmail
    ) {
        Pessoa pessoa = Pessoa.builder()
                .id(pessoaID)
                .nome(nome)
                .sobrenome(pessoaSobrenome)
                .nascimento(pessoaDtNasci)
                .tipo(pesosaTipo)
                .email(pessoaEmail)
                .build();

        Usuario usuario = Usuario.builder()
                .username(username)
                .pessoa(pessoa)
                .build();
        ExampleMatcher matcher = ExampleMatcher
                .matchingAll()
                .withIgnoreCase()
                .withIgnoreNullValues();

        Example<Usuario> example = Example.of(usuario, matcher);
        var entity = service.findAll(example);

        return entity.stream().map(service::toResponse).toList();
    }

    @Override
    @GetMapping(value = "/{id}")
    public UsuarioResponse findById(@PathVariable Long id) {
        return service.toResponse(service.findById(id));
    }

    @Override
    public ResponseEntity<UsuarioResponse> save(UsuarioRequest r) {
        var entity = service.toEntity(r);
        var saved = service.save(entity);
        var response = service.toResponse(saved);
        var uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(saved)
                .toUri();
        return ResponseEntity.created(uri).body(response);
    }
}
