package br.com.fiap.simuladospringpfunidades.resource;

import br.com.fiap.simuladospringpfunidades.dto.request.ChefeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.ChefeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

public class ChefeResource implements ResourceDTO<ChefeRequest, ChefeResponse> {

    @GetMapping
    public Collection<ChefeResponse> findAll(
            @RequestParam(name = "userChefe", required = false) Long userChefeID,
            @RequestParam(name = "substituto",required = false) Boolean substituto,
            @RequestParam(name = "unidade",required = false) Long unidade
    ) {
        return List.of();
    }

    @Override
    public ResponseEntity<ChefeResponse> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<ChefeResponse> save(ChefeRequest r) {
        return null;
    }
}
