package br.com.fiap.simuladospringpfunidades.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TB_UNIDADE", uniqueConstraints = {
        @UniqueConstraint(name = "UK_TB_UNIDADE_SIGLA_MACRO", columnNames = {"SIGLA","MACRO"})
})
public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_UNIDADE")
    @SequenceGenerator(name = "SQ_UNIDADE", sequenceName = "SQ_UNIDADE", allocationSize = 1)
    @Column(name = "ID_UNIDADE")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "SIGLA")
    private String sigla;

    @Column(name = "DESCRICAO")
    private String descricao;

    @ManyToOne(fetch = FetchType.EAGER,cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "UNIDADE",
            referencedColumnName = "ID_UNIDADE",
            foreignKey = @ForeignKey(
                    name = "FK_MACRO_UNIDADE"
            )
    )
    private Unidade macro;

}
