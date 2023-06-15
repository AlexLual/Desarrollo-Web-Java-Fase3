package org.bedu.fase3.postwork.persistence;

import org.bedu.fase3.postwork.persistence.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    
}
