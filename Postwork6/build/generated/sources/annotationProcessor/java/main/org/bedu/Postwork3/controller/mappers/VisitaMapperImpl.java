package org.bedu.Postwork3.controller.mappers;

import javax.annotation.processing.Generated;
import org.bedu.Postwork3.model.Visita;
import org.bedu.Postwork3.persistence.entities.Cliente;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-12T18:14:48-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class VisitaMapperImpl implements VisitaMapper {

    @Override
    public org.bedu.Postwork3.persistence.entities.Visita visitaModelToVisitaEntity(Visita visitaModel) {
        if ( visitaModel == null ) {
            return null;
        }

        org.bedu.Postwork3.persistence.entities.Visita visita = new org.bedu.Postwork3.persistence.entities.Visita();

        visita.setId( visitaModel.getId() );
        visita.setCliente( clienteToCliente( visitaModel.getCliente() ) );
        visita.setFechaProgramada( visitaModel.getFechaProgramada() );
        visita.setDireccion( visitaModel.getDireccion() );
        visita.setProposito( visitaModel.getProposito() );
        visita.setVendedor( visitaModel.getVendedor() );

        return visita;
    }

    @Override
    public Visita visitaEntityToVisitaModel(org.bedu.Postwork3.persistence.entities.Visita visita) {
        if ( visita == null ) {
            return null;
        }

        Visita.VisitaBuilder visita1 = Visita.builder();

        visita1.id( visita.getId() );
        visita1.cliente( clienteToCliente1( visita.getCliente() ) );
        visita1.fechaProgramada( visita.getFechaProgramada() );
        visita1.direccion( visita.getDireccion() );
        visita1.proposito( visita.getProposito() );
        visita1.vendedor( visita.getVendedor() );

        return visita1.build();
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
