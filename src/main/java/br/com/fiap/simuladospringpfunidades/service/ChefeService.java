package br.com.fiap.simuladospringpfunidades.service;

import br.com.fiap.simuladospringpfunidades.dto.request.ChefeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.ChefeResponse;
import br.com.fiap.simuladospringpfunidades.entity.Chefe;
import org.springframework.data.domain.Example;

import java.util.List;

public class ChefeService implements ServiceDTO<Chefe, ChefeRequest, ChefeResponse>{
    @Override
    public Chefe toEntity(ChefeRequest r) {
        return null;
    }

    @Override
    public ChefeResponse toResponse(Chefe e) {
        return null;
    }

    @Override
    public List<Chefe> findAll() {
        return List.of();
    }

    @Override
    public List<Chefe> findAll(Example<Chefe> example) {
        return List.of();
    }

    @Override
    public Chefe findById(Long id) {
        return null;
    }

    @Override
    public Chefe save(Chefe e) {
        return null;
    }
}
