package org.bedu.Postwork3.model;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
    public class Producto {
        @PositiveOrZero(message = "El identificador del producto no puede ser un número negativo")
        private final long id;

        @NotEmpty(message = "El nombre del producto no puede estar en blanco.")
        @Size(min = 4, max = 30, message = "El nombre del producto debe tener entre 4 y 30 letras.")
        private final String nombre;

        private final String categoria;

        @DecimalMin(value = "1.00", inclusive = true, message = "El precio del producto debe ser de al menos 1.00")
        private final float precio;

        @NotEmpty(message = "El núemero de registro del producto no puede estar en blanco.")
        @Pattern(regexp = "^(\\d{3}[-]?){2}\\d{4}$")
        private final String numeroRegistro;

        @PastOrPresent(message = "La fecha de creación del producto no puede ocurrir en el futuro.")
        private final LocalDate fechaCreacion;
    }

