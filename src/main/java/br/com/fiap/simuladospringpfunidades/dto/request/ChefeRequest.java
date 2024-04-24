package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record ChefeRequest(
        @NotNull(message = "Substituto tem que ser verdadeiro ou falso")
        Boolean subistituto,

        AbstractRequest usuario,

        AbstractRequest unidade,

        LocalDateTime inicio,

        LocalDateTime fim



) {
}
