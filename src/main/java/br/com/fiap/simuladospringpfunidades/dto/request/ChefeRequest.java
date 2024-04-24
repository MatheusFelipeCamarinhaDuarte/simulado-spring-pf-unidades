package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record ChefeRequest(
        @NotNull(message = "Substituto tem que ser verdadeiro ou falso")
        Boolean subistituto,

        @NotNull(message = "O chefe tem que ter algum usuário")
        AbstractRequest usuario,

        @NotNull(message = "Chefe precisa pertencer a alguma unidade")
        AbstractRequest unidade,

        LocalDateTime inicio,

        LocalDateTime fim



) {
}
