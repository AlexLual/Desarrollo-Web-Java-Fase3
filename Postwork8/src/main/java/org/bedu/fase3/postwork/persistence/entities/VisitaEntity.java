package org.bedu.fase3.postwork.persistence.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Table(name = "VISITAS")
@NoArgsConstructor
@Entity
public class VisitaEntity {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private ClienteEntity cliente;

    @Column(nullable = false)
    private LocalDateTime fechaProgramada;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String proposito;

    @Column(nullable = false)
    private String vendedor;
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(LocalDateTime fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }  
}
