package br.com.fiap.simuladospringpfunidades.dto.response;

import br.com.fiap.simuladospringpfunidades.entity.Tipo;

import java.time.LocalDate;

public record PessoaResponse(
        Long id,
        String nome,
        String sobrenome,
        String email,
        LocalDate nascimento,
        Tipo tipo
) {
}
