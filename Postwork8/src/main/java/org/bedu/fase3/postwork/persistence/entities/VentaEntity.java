package org.bedu.fase3.postwork.persistence.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Table(name = "VENTAS")
@NoArgsConstructor
@Entity
public class VentaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ventaId;

    private float monto;

    @OneToMany
    private List<ProductoEntity> productos;

    @ManyToOne
    private ClienteEntity cliente;

    @Column(nullable = false)
    private LocalDateTime fechaCreación;

    public long getVentaId() {
        return ventaId;
    }

    public void setVentaId(long ventaId) {
        this.ventaId = ventaId;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public List<ProductoEntity> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoEntity> productos) {
        this.productos = productos;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFechaCreación() {
        return fechaCreación;
    }

    public void setFechaCreación(LocalDateTime fechaCreación) {
        this.fechaCreación = fechaCreación;
    }
    
}
