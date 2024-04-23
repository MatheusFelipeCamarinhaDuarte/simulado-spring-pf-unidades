package br.com.fiap.simuladospringpfunidades.resource;

import br.com.fiap.simuladospringpfunidades.dto.request.UnidadeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.UnidadeResponse;
import org.springframework.http.ResponseEntity;

public class UnidadeResource implements ResourceDTO<UnidadeRequest, UnidadeResponse>{
    @Override
    public ResponseEntity<UnidadeResponse> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UnidadeResponse> save(UnidadeRequest r) {
        return null;
    }
}
