package org.bedu.Postwork3.model;

import jakarta.validation.constraints.*;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Venta {
    @PositiveOrZero(message = "El identificador de la venta no puede ser un número negativo")
    private final long ventaId;

    @DecimalMin(value = "1.00", inclusive = true, message = "La venta debe ser de al menos 1.00")
    private final float monto;

    @NotEmpty(message = "La venta debe tener por lo menos un producto.")
    private final List<Producto> productos;

    @NotNull(message = "La venta debe haberse realizado a algún cliente.")
    private final Cliente cliente;

    @PastOrPresent(message = "La venta no puede ocurrir en el futuro.")
    private final LocalDateTime fechaCreacion;
}
