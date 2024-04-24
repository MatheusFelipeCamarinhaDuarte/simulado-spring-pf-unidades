package br.com.fiap.simuladospringpfunidades.entity;

import br.com.fiap.simuladospringpfunidades.repository.PessoaRepository;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TB_USUARIO", uniqueConstraints = {
    @UniqueConstraint(name = "UK_TB_USUARIO_USERNAME", columnNames = {
            "USERNAME"
    }),
    @UniqueConstraint(name = "UK_TB_USUARIO_PESSOA", columnNames = {
            "PESSOA"
    })
})
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USERNAME")
    @SequenceGenerator(name = "SQ_USERNAME", sequenceName = "SQ_USERNAME")
    @Column(name = "ID_USUARIO")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "PESSOA",
            referencedColumnName = "ID_PESSOA",
            foreignKey = @ForeignKey(
                    name = "FK_USUARIO_PESSOA"
            )
    )
    private Pessoa pessoa;

}
