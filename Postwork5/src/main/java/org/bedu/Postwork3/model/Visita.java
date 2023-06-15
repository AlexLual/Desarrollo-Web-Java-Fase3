package org.bedu.Postwork3.model;

import jakarta.validation.constraints.*;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Visita {
    @PositiveOrZero(message = "El identificador de la visita no puede ser un número negativo.")
    private final long id;

    @NotNull(message = "La visita debe haberse realizado a algún cliente.")
    private final Cliente cliente;

    @Future(message = "La fecha de la cita no puede ser en una fecha en el pasado.")
    private final LocalDateTime fechaProgramada;

    @NotEmpty(message = "La dirección no puede estar en blanco.")
    @Size(min = 10, message = "La dirección debe tener al menos 10 letras.")
    private final String direccion;

    @NotEmpty(message = "El propósito de la visita no puede estar en blanco.")
    @Size(min = 15, message = "El propósito de la visita debe tener al menos 15 letras.")
    private final String proposito;

    @NotEmpty(message = "El nombre del vendedor no puede estar en blanco.")
    @Size(min = 4, max = 30, message = "El nombre del vendedor debe tener entre 4 y 30 letras.")
    private final String vendedor;
}