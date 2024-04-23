package br.com.fiap.simuladospringpfunidades.repository;

import br.com.fiap.simuladospringpfunidades.entity.Chefe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefeRepository extends JpaRepository<Chefe, Long> {
}
