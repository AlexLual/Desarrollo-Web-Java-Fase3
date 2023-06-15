package org.bedu.Postwork3.controller.mappers;

import javax.annotation.processing.Generated;
import org.bedu.Postwork3.persistence.entities.Cliente;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-12T18:14:48-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public Cliente clienteModelToClienteEntity(org.bedu.Postwork3.model.Cliente clienteModel) {
        if ( clienteModel == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( clienteModel.getId() );
        cliente.setNombre( clienteModel.getNombre() );
        cliente.setCorreoContacto( clienteModel.getCorreoContacto() );
        cliente.setNumeroEmpleados( clienteModel.getNumeroEmpleados() );
        cliente.setDireccion( clienteModel.getDireccion() );

        return cliente;
    }

    @Override
    public org.bedu.Postwork3.model.Cliente clienteEntityToClienteModel(Cliente cliente) {
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
