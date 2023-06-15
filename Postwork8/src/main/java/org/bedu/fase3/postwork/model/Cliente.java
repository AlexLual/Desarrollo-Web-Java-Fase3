package org.bedu.fase3.postwork.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cliente {

    @Min(value = 1, message = "El Id debe ser mayor que cero")
    @Positive (message = "El Id no puede ser un número negativo")
    private long Id;

    @NotEmpty(message = "El nombre no puede estar vacío")
    @Size (min = 4, max=30, message = "El nombre debe tener al menos 4 letras y ser menor a 30")
    private String nombre;

    @Email
    private String correoElectronico;

    @Min(value= 10, message = "Los clientes con menos de 10 empleados no son válidos")
    @Max(value = 1000, message = "Los clientes con más de 10000 empleados no son válidos")
    private int numeroEmpleados;

    @NotBlank (message = "Se debe proporcionar una dirección")
    private String direccion;
    
    public Cliente(long Id, String nombre, String correoElectronico, int numeroEmpleados, String direccion) {
        this.Id = Id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.numeroEmpleados = numeroEmpleados;
        this.direccion = direccion;
    }

    public Cliente() {
    }
}
