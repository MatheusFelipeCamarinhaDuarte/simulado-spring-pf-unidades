package br.com.fiap.simuladospringpfunidades.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TB_PESSOA", uniqueConstraints = {
        @UniqueConstraint(name = "UK_TB_PESSOA_EMAIL", columnNames = {"EMAIL"})
})
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PESSOA")
    @SequenceGenerator(name = "SQ_PESSOA", sequenceName = "SQ_PESSOA")
    @Column(name = "ID_PESSOA")
    private Long id;

    @Column(name = "NM_PESSOA")
    private String nome;

    @Column(name = "SOBRENOME")
    private String sobrenome;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DT_NASCIMENTO")
    private LocalDate nascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_PESSOA", nullable = false)
    private Tipo tipo;

}
