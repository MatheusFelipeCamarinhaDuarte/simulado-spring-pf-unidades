package br.com.fiap.simuladospringpfunidades.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Tipo {

    PF( 1L, "Pessoa Física", "PF" ),
    PJ( 2L, "Pessoa Jurídica", "PJ" );

    private Long id;
    private String nome;
    private String sigla;

    @Override
    public String toString() {
        return String.valueOf( sigla );
    }
}
