package org.bedu.Postwork3.controller.mappers;

import javax.annotation.processing.Generated;
import org.bedu.Postwork3.model.Producto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-12T20:07:42-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class ProductoMapperImpl implements ProductoMapper {

    @Override
    public org.bedu.Postwork3.persistence.entities.Producto productoModelToProductoEntity(Producto productoModel) {
        if ( productoModel == null ) {
            return null;
        }

        org.bedu.Postwork3.persistence.entities.Producto producto = new org.bedu.Postwork3.persistence.entities.Producto();

        producto.setId( productoModel.getId() );
        producto.setNombre( productoModel.getNombre() );
        producto.setCategoria( productoModel.getCategoria() );
        producto.setPrecio( productoModel.getPrecio() );
        producto.setNumeroRegistro( productoModel.getNumeroRegistro() );
        producto.setFechaCreacion( productoModel.getFechaCreacion() );

        return producto;
    }

    @Override
    public Producto productoEntityToProductoModel(org.bedu.Postwork3.persistence.entities.Producto producto) {
        if ( producto == null ) {
            return null;
        }

        Producto.ProductoBuilder producto1 = Producto.builder();

        if ( producto.getId() != null ) {
            producto1.id( producto.getId() );
        }
        producto1.nombre( producto.getNombre() );
        producto1.categoria( producto.getCategoria() );
        producto1.precio( producto.getPrecio() );
        producto1.numeroRegistro( producto.getNumeroRegistro() );
        producto1.fechaCreacion( producto.getFechaCreacion() );

        return producto1.build();
    }
}
