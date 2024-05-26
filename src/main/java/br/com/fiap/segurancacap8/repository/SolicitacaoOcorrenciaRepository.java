package br.com.fiap.segurancacap8.repository;

import br.com.fiap.segurancacap8.model.SolicitacaoOcorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitacaoOcorrenciaRepository extends JpaRepository<SolicitacaoOcorrencia, Long> {
}


