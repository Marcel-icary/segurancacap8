package br.com.fiap.segurancacap8.repository;

import br.com.fiap.segurancacap8.model.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Long> {
}



