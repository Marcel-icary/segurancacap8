package br.com.fiap.segurancacap8.repository;

import br.com.fiap.segurancacap8.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}

