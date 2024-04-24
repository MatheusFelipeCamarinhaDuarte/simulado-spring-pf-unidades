package br.com.fiap.simuladospringpfunidades.resource;

import br.com.fiap.simuladospringpfunidades.dto.request.ChefeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.ChefeResponse;
import br.com.fiap.simuladospringpfunidades.entity.Chefe;
import br.com.fiap.simuladospringpfunidades.service.ChefeService;
import br.com.fiap.simuladospringpfunidades.service.UnidadeService;
import br.com.fiap.simuladospringpfunidades.service.UsuarioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/chefe")
public class ChefeResource implements ResourceDTO<ChefeRequest, ChefeResponse> {

    @Autowired
    private ChefeService service;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private UnidadeService unidadeService;

    @GetMapping
    public Collection<ChefeResponse> findAll(
            @RequestParam(name = "userChefe", required = false) Long userChefeID,
            @RequestParam(name = "substituto",required = false) Boolean substituto,
            @RequestParam(name = "unidade",required = false) Long unidadeID
    ) {
        var user = usuarioService.findById(userChefeID);
        var unidade = unidadeService.findById(unidadeID);
        Chefe chefe = Chefe.builder()
                .usuario(user)
                .substituto(substituto)
                .unidade(unidade)
                .build();
        ExampleMatcher matcher = ExampleMatcher
                .matchingAll()
                .withIgnoreCase()
                .withIgnoreNullValues();
        Example<Chefe> example = Example.of(chefe, matcher);

        var entity = service.findAll(example);

        return entity.stream().map(service::toResponse).toList();
    }

    @Override
    @RequestMapping(value = "/{id}")
    public ChefeResponse findById(@PathVariable Long id) {
        return service.toResponse(service.findById(id));
    }

    @Override
    @Transactional
    @PostMapping
    public ResponseEntity<ChefeResponse> save(ChefeRequest r) {
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
