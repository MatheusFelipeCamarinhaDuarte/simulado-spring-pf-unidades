package br.com.fiap.simuladospringpfunidades.dto.response;

import java.time.LocalDateTime;

public record ChefeResponse(
        Long id,
        Boolean substituto,
        UnidadeResponse unidade,
        UsuarioResponse usuario,
        LocalDateTime incio,
        LocalDateTime fim
) {
}
