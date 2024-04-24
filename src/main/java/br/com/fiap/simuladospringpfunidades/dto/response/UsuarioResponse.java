package br.com.fiap.simuladospringpfunidades.dto.response;

public record UsuarioResponse(
        Long id,
        String username,
        PessoaResponse pessoa
) {
}
