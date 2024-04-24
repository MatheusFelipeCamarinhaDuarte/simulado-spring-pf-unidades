package br.com.fiap.simuladospringpfunidades.service;

import br.com.fiap.simuladospringpfunidades.dto.request.UsuarioRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.UsuarioResponse;
import br.com.fiap.simuladospringpfunidades.entity.Pessoa;
import br.com.fiap.simuladospringpfunidades.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service

public class UsuarioService implements ServiceDTO<Usuario, UsuarioRequest, UsuarioResponse>{
    @Autowired
    private PessoaService pessoaService;

    @Override
    public Usuario toEntity(UsuarioRequest r) {
        Pessoa pessoa = null;
        if (Objects.nonNull(r.pessoa().id())){
            pessoa = pessoaService.findById(r.pessoa().id() );
        }

        return Usuario.builder()
                .username(r.username())
                .password(r.password())
                .pessoa(pessoa)
                .build();
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
