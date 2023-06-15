package org.bedu.fase3.postwork.controller.mappers;

import org.bedu.fase3.postwork.persistence.entities.VentaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VentaMapper {

    VentaEntity ventaModelToVentaEntity(org.bedu.fase3.postwork.model.Venta ventaModel);

    org.bedu.fase3.postwork.model.Venta ventaEntityToVentaModel(VentaEntity venta);

}
