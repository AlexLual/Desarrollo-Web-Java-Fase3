package org.bedu.Postwork3.persistence;

import org.bedu.Postwork3.persistence.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
