package org.bedu.fase3.postwork.controller.mappers;

import org.bedu.fase3.postwork.persistence.entities.ProductoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {

    ProductoEntity productoModelToProductoEntity(org.bedu.fase3.postwork.model.Producto productoModel);

    org.bedu.fase3.postwork.model.Producto  productoEntityToProductoModel(ProductoEntity producto);

}