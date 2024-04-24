package br.com.fiap.simuladospringpfunidades.service;

import br.com.fiap.simuladospringpfunidades.dto.request.UnidadeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.UnidadeResponse;
import br.com.fiap.simuladospringpfunidades.entity.Unidade;
import br.com.fiap.simuladospringpfunidades.repository.UnidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UnidadeService implements ServiceDTO<Unidade, UnidadeRequest, UnidadeResponse> {
    @Autowired
    private UnidadeRepository repo;

    @Override
    public Unidade toEntity(UnidadeRequest r) {
        Unidade u = null;
        if (Objects.nonNull(r.macro().id())) {
            u = findById(r.macro().id());
        }

        return Unidade.builder()
                .nome(r.nome())
                .sigla(r.sigla())
                .descricao(r.descricao())
                .macro(u)
                .build();
    }

    @Override
    public UnidadeResponse toResponse(Unidade e) {
        return null;
    }

    @Override
    public List<Unidade> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Unidade> findAll(Example<Unidade> example) {
        return repo.findAll(example);
    }

    @Override
    public Unidade findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Unidade save(Unidade e) {
        return repo.save(e);
    }
}
