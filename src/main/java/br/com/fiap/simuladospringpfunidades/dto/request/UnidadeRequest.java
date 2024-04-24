package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.constraints.NotNull;

public record UnidadeRequest(
        @NotNull(message = "A unidade precisa ter um nome")
        String nome,

        @NotNull(message = "A Unidade precisa ter um sigla")
        String sigla,

        String descricao,

        AbstractRequest macro

) {
}
