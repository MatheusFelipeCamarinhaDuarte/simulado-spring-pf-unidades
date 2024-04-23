package br.com.fiap.simuladospringpfunidades.service;

import br.com.fiap.simuladospringpfunidades.dto.request.PessoaRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.PessoaResponse;
import br.com.fiap.simuladospringpfunidades.entity.Pessoa;
import org.springframework.data.domain.Example;

import java.util.List;

public class PessoaService implements ServiceDTO<Pessoa, PessoaRequest, PessoaResponse>{
    @Override
    public Pessoa toEntity(PessoaRequest r) {
        return null;
    }

    @Override
    public PessoaResponse toResponse(Pessoa e) {
        return null;
    }

    @Override
    public List<Pessoa> findAll() {
        return List.of();
    }

    @Override
    public List<Pessoa> findAll(Example<Pessoa> example) {
        return List.of();
    }

    @Override
    public Pessoa findById(Long id) {
        return null;
    }

    @Override
    public Pessoa save(Pessoa e) {
        return null;
    }
}
