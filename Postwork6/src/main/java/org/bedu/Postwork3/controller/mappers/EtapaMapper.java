package org.bedu.Postwork3.controller.mappers;

import org.bedu.Postwork3.persistence.entities.Etapa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EtapaMapper {
    Etapa etapaModelToEtapaEntity(org.bedu.Postwork3.model.Etapa etapaModel);

    org.bedu.Postwork3.model.Etapa etapaEntityToEtapaModel(Etapa etapa);
}