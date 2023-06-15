package org.bedu.Postwork3.controller.mappers;
import org.bedu.Postwork3.persistence.entities.Venta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VentaMapper {
    Venta ventaModelToVentaEntity(org.bedu.Postwork3.model.Venta ventaModel);

    org.bedu.Postwork3.model.Venta ventaEntityToVentaModel(Venta venta);
}