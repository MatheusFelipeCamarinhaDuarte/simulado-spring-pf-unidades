package br.com.fiap.simuladospringpfunidades.service;

import br.com.fiap.simuladospringpfunidades.dto.request.UnidadeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.UnidadeResponse;
import br.com.fiap.simuladospringpfunidades.entity.Unidade;
import org.springframework.data.domain.Example;

import java.util.List;

public class UnidadeService implements ServiceDTO<Unidade, UnidadeRequest, UnidadeResponse> {
    @Override
    public Unidade toEntity(UnidadeRequest r) {
        return null;
    }

    @Override
    public UnidadeResponse toResponse(Unidade e) {
        return null;
    }

    @Override
    public List<Unidade> findAll() {
        return List.of();
    }

    @Override
    public List<Unidade> findAll(Example<Unidade> example) {
        return List.of();
    }

    @Override
    public Unidade findById(Long id) {
        return null;
    }

    @Override
    public Unidade save(Unidade e) {
        return null;
    }
}
