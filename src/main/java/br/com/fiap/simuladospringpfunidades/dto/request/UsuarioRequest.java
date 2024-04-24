package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.constraints.NotNull;

public record UsuarioRequest(

        @NotNull(message = "Um usuário precisa ter um nome")
        String username,

        @NotNull(message = "O usuário precisa ter senha")
        String password,

        AbstractRequest pessoa

) {
}
