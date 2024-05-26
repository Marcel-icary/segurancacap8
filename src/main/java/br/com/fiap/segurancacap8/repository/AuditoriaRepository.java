package br.com.fiap.segurancacap8.repository;

import br.com.fiap.segurancacap8.model.Auditoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriaRepository extends JpaRepository<Auditoria, Long> {
}

