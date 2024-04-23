package br.com.fiap.simuladospringpfunidades.repository;

import br.com.fiap.simuladospringpfunidades.entity.Unidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Long> {
}
