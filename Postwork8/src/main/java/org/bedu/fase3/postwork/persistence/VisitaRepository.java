package org.bedu.fase3.postwork.persistence;

import org.bedu.fase3.postwork.persistence.entities.VisitaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitaRepository extends JpaRepository <VisitaEntity, Long> {
    
}
