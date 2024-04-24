package br.com.fiap.simuladospringpfunidades.resource;

import br.com.fiap.simuladospringpfunidades.dto.request.UnidadeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.UnidadeResponse;
import br.com.fiap.simuladospringpfunidades.entity.Unidade;
import br.com.fiap.simuladospringpfunidades.service.UnidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "unidade")
public class UnidadeResource implements ResourceDTO<UnidadeRequest, UnidadeResponse>{

    @Autowired
    private UnidadeService service;

    @GetMapping
    public Collection<UnidadeResponse> findAll(
            @RequestParam(name = "nome", required = false) String nome,
            @RequestParam(name = "silga", required = false) String sigla,
            @RequestParam(name = "macro", required = false) Long macroID
    ) {
        Unidade macro = null;
        if (Objects.nonNull(macroID)){
            macro = service.findById(macroID);
        }
        Unidade unidade = Unidade.builder()
                .nome(nome)
                .sigla(sigla)
                .macro(macro)
                .build();
        ExampleMatcher matcher = ExampleMatcher
                .matchingAll()
                .withIgnoreNullValues()
                .withIgnoreCase();
        Example<Unidade> example = Example.of(unidade, matcher);
        var entity = service.findAll(example);

        return entity.stream().map(service::toResponse).toList();
    }

    @Override
    @GetMapping(value = "/{id}")
    public UnidadeResponse findById(@PathVariable Long id) {
        return service.toResponse(service.findById(id));
    }

    @Override
    public ResponseEntity<UnidadeResponse> save(UnidadeRequest r) {
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
