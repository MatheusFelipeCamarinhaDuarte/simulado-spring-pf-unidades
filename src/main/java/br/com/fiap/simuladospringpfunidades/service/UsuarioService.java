package br.com.fiap.simuladospringpfunidades.service;

import br.com.fiap.simuladospringpfunidades.dto.request.UsuarioRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.UsuarioResponse;
import br.com.fiap.simuladospringpfunidades.entity.Usuario;
import org.springframework.data.domain.Example;

import java.util.List;

public class UsuarioService implements ServiceDTO<Usuario, UsuarioRequest, UsuarioResponse>{
    @Override
    public Usuario toEntity(UsuarioRequest r) {
        return null;
    }

    @Override
    public UsuarioResponse toResponse(Usuario e) {
        return null;
    }

    @Override
    public List<Usuario> findAll() {
        return List.of();
    }

    @Override
    public List<Usuario> findAll(Example<Usuario> example) {
        return List.of();
    }

    @Override
    public Usuario findById(Long id) {
        return null;
    }

    @Override
    public Usuario save(Usuario e) {
        return null;
    }
}
