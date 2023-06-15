package org.bedu.fase3.postwork.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Table(name = "CLIENTES")
@NoArgsConstructor
@Entity
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "nombre", nullable = true)
    private String nombre;

    @Column(name = "correo_electronico", nullable = false)
    private String correoElectronico;

    @Column(name = "numero_empleado")
    private int numeroEmpleados;

    private String direccion;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }  
    
}
