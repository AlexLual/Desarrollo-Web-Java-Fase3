package org.bedu.Postwork3.controller.mappers;
import org.bedu.Postwork3.persistence.entities.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    Producto productoModelToProductoEntity(org.bedu.Postwork3.model.Producto productoModel);

    org.bedu.Postwork3.model.Producto productoEntityToProductoModel(Producto producto);
}