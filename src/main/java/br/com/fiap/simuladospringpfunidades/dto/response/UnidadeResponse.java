package br.com.fiap.simuladospringpfunidades.dto.response;

import lombok.Builder;

@Builder
public record UnidadeResponse(
        Long id,
        String nome,
        String descricao,
        String sigla,
        UnidadeResponse macro
) {
}
