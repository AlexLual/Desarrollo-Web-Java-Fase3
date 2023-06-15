package org.bedu.Postwork3.controller.mappers;

import javax.annotation.processing.Generated;
import org.bedu.Postwork3.persistence.entities.Etapa;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-12T18:14:48-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class EtapaMapperImpl implements EtapaMapper {

    @Override
    public Etapa etapaModelToEtapaEntity(org.bedu.Postwork3.model.Etapa etapaModel) {
        if ( etapaModel == null ) {
            return null;
        }

        Etapa etapa = new Etapa();

        etapa.setEtapaId( etapaModel.getEtapaId() );
        etapa.setNombre( etapaModel.getNombre() );
        etapa.setOrden( etapaModel.getOrden() );

        return etapa;
    }

    @Override
    public org.bedu.Postwork3.model.Etapa etapaEntityToEtapaModel(Etapa etapa) {
        if ( etapa == null ) {
            return null;
        }

        org.bedu.Postwork3.model.Etapa.EtapaBuilder etapa1 = org.bedu.Postwork3.model.Etapa.builder();

        if ( etapa.getEtapaId() != null ) {
            etapa1.etapaId( etapa.getEtapaId() );
        }
        etapa1.nombre( etapa.getNombre() );
        if ( etapa.getOrden() != null ) {
            etapa1.orden( etapa.getOrden() );
        }

        return etapa1.build();
    }
}
