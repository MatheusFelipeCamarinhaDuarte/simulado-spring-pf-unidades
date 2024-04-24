package br.com.fiap.simuladospringpfunidades.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ChefeResponse(
        Long id,
        Boolean substituto,
        UnidadeResponse unidade,
        UsuarioResponse usuario,
        LocalDateTime incio,
        LocalDateTime fim
) {
}
