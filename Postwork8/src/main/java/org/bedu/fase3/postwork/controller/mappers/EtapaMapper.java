package org.bedu.fase3.postwork.controller.mappers;

import org.bedu.fase3.postwork.persistence.entities.EtapaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EtapaMapper {
    
    EtapaEntity etapaModelToEtapaEntity(org.bedu.fase3.postwork.model.Etapa etapaModel);

    org.bedu.fase3.postwork.model.Etapa etapaEntityToEtapaModel(EtapaEntity etapa);

}
