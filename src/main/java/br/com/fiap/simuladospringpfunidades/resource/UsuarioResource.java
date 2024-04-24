package br.com.fiap.simuladospringpfunidades.resource;

import br.com.fiap.simuladospringpfunidades.dto.request.UsuarioRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.UsuarioResponse;
import br.com.fiap.simuladospringpfunidades.entity.Tipo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public class UsuarioResource implements ResourceDTO<UsuarioRequest, UsuarioResponse>{

    @GetMapping
    public Collection<UsuarioResponse> findAll(
            @RequestParam(name = "username", required = false) String username,
            @RequestParam(name = "pessoaID", required = false) Long pessoaID,
            @RequestParam(name = "nome", required = false) String nome,
            @RequestParam(name = "sobrenome", required = false) String sobrenome,
            @RequestParam(name = "dtnasci", required = false) LocalDate dtnasci,
            @RequestParam(name = "tipo", required = false) Tipo tipo,
            @RequestParam(name = "email", required = false) String email
            ) {
        return List.of();
    }

    @Override
    public ResponseEntity<UsuarioResponse> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UsuarioResponse> save(UsuarioRequest r) {
        return null;
    }
}
