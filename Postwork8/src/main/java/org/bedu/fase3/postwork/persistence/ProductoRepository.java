package org.bedu.fase3.postwork.persistence;

import org.bedu.fase3.postwork.persistence.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {
    
}
