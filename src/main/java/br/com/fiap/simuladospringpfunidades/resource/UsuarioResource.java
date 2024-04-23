package br.com.fiap.simuladospringpfunidades.resource;

import br.com.fiap.simuladospringpfunidades.dto.request.UsuarioRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.UsuarioResponse;
import org.springframework.http.ResponseEntity;

public class UsuarioResource implements ResourceDTO<UsuarioRequest, UsuarioResponse>{
    @Override
    public ResponseEntity<UsuarioResponse> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UsuarioResponse> save(UsuarioRequest r) {
        return null;
    }
}
