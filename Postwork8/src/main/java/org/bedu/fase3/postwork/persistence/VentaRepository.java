package org.bedu.fase3.postwork.persistence;

import org.bedu.fase3.postwork.persistence.entities.VentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<VentaEntity, Long> {
    
}
