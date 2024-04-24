package br.com.fiap.simuladospringpfunidades.dto.response;

import br.com.fiap.simuladospringpfunidades.entity.Tipo;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record PessoaResponse(
        Long id,
        String nome,
        String sobrenome,
        String email,
        LocalDate nascimento,
        Tipo tipo
) {
}
