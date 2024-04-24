package br.com.fiap.simuladospringpfunidades.service;

import br.com.fiap.simuladospringpfunidades.dto.request.ChefeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.ChefeResponse;
import br.com.fiap.simuladospringpfunidades.entity.Chefe;
import br.com.fiap.simuladospringpfunidades.entity.Unidade;
import br.com.fiap.simuladospringpfunidades.entity.Usuario;
import br.com.fiap.simuladospringpfunidades.repository.ChefeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ChefeService implements ServiceDTO<Chefe, ChefeRequest, ChefeResponse>{
    @Autowired
    private ChefeRepository repo;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UnidadeService unidadeService;

    @Override
    public Chefe toEntity(ChefeRequest r) {
        Unidade uni = null;
        Usuario user = null;
        if (Objects.nonNull(r.unidade().id())){
            uni = unidadeService.findById(r.unidade().id());
        }
        if (Objects.nonNull(r.usuario().id())){
            user = usuarioService.findById(r.usuario().id());
        }
    return Chefe.builder()
            .substituto(r.subistituto())
            .usuario(user)
            .unidade(uni)
            .inicio(r.inicio())
            .fim(r.fim())
            .build();
    }

    @Override
    public ChefeResponse toResponse(Chefe e) {
        return null;
    }

    @Override
    public List<Chefe> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Chefe> findAll(Example<Chefe> example) {
        return repo.findAll(example);
    }

    @Override
    public Chefe findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Chefe save(Chefe e) {
        return  repo.save(e);
    }
}
