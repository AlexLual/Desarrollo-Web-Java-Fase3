package org.bedu.fase3.postwork.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Table(name="ETAPAS")
@NoArgsConstructor
@Entity
public class EtapaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long etapaId;

    private String nombre;

    @Column(unique = true, nullable = false)
    private int orden;

    public long getEtapaId() {
        return etapaId;
    }

    public void setEtapaId(long etapaId) {
        this.etapaId = etapaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
   
}
