package br.com.fiap.simuladospringpfunidades.dto.request;

import br.com.fiap.simuladospringpfunidades.entity.Tipo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record PessoaRequest(
        @NotNull(message = "A pessoa precisa ter nome")
        String nome,

        String sobrenome,

        @Email(message = "Formato de email incorreto")
        @NotNull(message = "Este campo precisa ser preenchido")
        String email,

        LocalDate nascimento,

        Tipo tipo


) {
}
