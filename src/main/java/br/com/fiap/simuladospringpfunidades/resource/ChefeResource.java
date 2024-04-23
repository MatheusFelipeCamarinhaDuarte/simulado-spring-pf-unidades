package br.com.fiap.simuladospringpfunidades.resource;

import br.com.fiap.simuladospringpfunidades.dto.request.ChefeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.ChefeResponse;
import org.springframework.http.ResponseEntity;

public class ChefeResource implements ResourceDTO<ChefeRequest, ChefeResponse> {
    @Override
    public ResponseEntity<ChefeResponse> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<ChefeResponse> save(ChefeRequest r) {
        return null;
    }
}
