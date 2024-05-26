package br.com.fiap.segurancacap8.repository;

import br.com.fiap.segurancacap8.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}



