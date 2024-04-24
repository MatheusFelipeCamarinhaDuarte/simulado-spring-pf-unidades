package br.com.fiap.simuladospringpfunidades.resource;

import br.com.fiap.simuladospringpfunidades.dto.request.UnidadeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.UnidadeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

public class UnidadeResource implements ResourceDTO<UnidadeRequest, UnidadeResponse>{

    @GetMapping
    public Collection<UnidadeResponse> findAll(
            @RequestParam(name = "nome", required = false) String nome,
            @RequestParam(name = "silga", required = false) String sigla,
            @RequestParam(name = "macro", required = false) Long macroID
    ) {
        return List.of();
    }

    @Override
    public ResponseEntity<UnidadeResponse> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UnidadeResponse> save(UnidadeRequest r) {
        return null;
    }
}
