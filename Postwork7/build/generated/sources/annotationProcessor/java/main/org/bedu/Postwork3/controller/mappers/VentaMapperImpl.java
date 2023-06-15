package org.bedu.Postwork3.controller.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.bedu.Postwork3.model.Producto;
import org.bedu.Postwork3.persistence.entities.Cliente;
import org.bedu.Postwork3.persistence.entities.Venta;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-12T20:07:42-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class VentaMapperImpl implements VentaMapper {

    @Override
    public Venta ventaModelToVentaEntity(org.bedu.Postwork3.model.Venta ventaModel) {
        if ( ventaModel == null ) {
            return null;
        }

        Venta venta = new Venta();

        venta.setVentaId( ventaModel.getVentaId() );
        venta.setMonto( ventaModel.getMonto() );
        venta.setProductos( productoListToProductoList( ventaModel.getProductos() ) );
        venta.setCliente( clienteToCliente( ventaModel.getCliente() ) );
        venta.setFechaCreacion( ventaModel.getFechaCreacion() );

        return venta;
    }

    @Override
    public org.bedu.Postwork3.model.Venta ventaEntityToVentaModel(Venta venta) {
        if ( venta == null ) {
            return null;
        }

        org.bedu.Postwork3.model.Venta.VentaBuilder venta1 = org.bedu.Postwork3.model.Venta.builder();

        venta1.ventaId( venta.getVentaId() );
        venta1.monto( venta.getMonto() );
        venta1.productos( productoListToProductoList1( venta.getProductos() ) );
        venta1.cliente( clienteToCliente1( venta.getCliente() ) );
        venta1.fechaCreacion( venta.getFechaCreacion() );

        return venta1.build();
    }

    protected org.bedu.Postwork3.persistence.entities.Producto productoToProducto(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        org.bedu.Postwork3.persistence.entities.Producto producto1 = new org.bedu.Postwork3.persistence.entities.Producto();

        producto1.setId( producto.getId() );
        producto1.setNombre( producto.getNombre() );
        producto1.setCategoria( producto.getCategoria() );
        producto1.setPrecio( producto.getPrecio() );
        producto1.setNumeroRegistro( producto.getNumeroRegistro() );
        producto1.setFechaCreacion( producto.getFechaCreacion() );

        return producto1;
    }

    protected List<org.bedu.Postwork3.persistence.entities.Producto> productoListToProductoList(List<Producto> list) {
        if ( list == null ) {
            return null;
        }

        List<org.bedu.Postwork3.persistence.entities.Producto> list1 = new ArrayList<org.bedu.Postwork3.persistence.entities.Producto>( list.size() );
        for ( Producto producto : list ) {
            list1.add( productoToProducto( producto ) );
        }

        return list1;
    }

    protected Cliente clienteToCliente(org.bedu.Postwork3.model.Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        Cliente cliente1 = new Cliente();

        cliente1.setId( cliente.getId() );
        cliente1.setNombre( cliente.getNombre() );
        cliente1.setCorreoContacto( cliente.getCorreoContacto() );
        cliente1.setNumeroEmpleados( cliente.getNumeroEmpleados() );
        cliente1.setDireccion( cliente.getDireccion() );

        return cliente1;
    }

    protected Producto productoToProducto1(org.bedu.Postwork3.persistence.entities.Producto producto) {
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

    protected List<Producto> productoListToProductoList1(List<org.bedu.Postwork3.persistence.entities.Producto> list) {
        if ( list == null ) {
            return null;
        }

        List<Producto> list1 = new ArrayList<Producto>( list.size() );
        for ( org.bedu.Postwork3.persistence.entities.Producto producto : list ) {
            list1.add( productoToProducto1( producto ) );
        }

        return list1;
    }

    protected org.bedu.Postwork3.model.Cliente clienteToCliente1(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        org.bedu.Postwork3.model.Cliente.ClienteBuilder cliente1 = org.bedu.Postwork3.model.Cliente.builder();

        if ( cliente.getId() != null ) {
            cliente1.id( cliente.getId() );
        }
        cliente1.nombre( cliente.getNombre() );
        cliente1.correoContacto( cliente.getCorreoContacto() );
        cliente1.numeroEmpleados( cliente.getNumeroEmpleados() );
        cliente1.direccion( cliente.getDireccion() );

        return cliente1.build();
    }
}
