package org.bedu.fase3.postwork.controller.mappers;

import org.bedu.fase3.postwork.persistence.entities.VisitaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VisitaMapper {
    
    VisitaEntity visitaModelToVisitaEntity(org.bedu.fase3.postwork.model.Visita visitaModel);

    org.bedu.fase3.postwork.model.Visita visitaEntityToVisitaModel(VisitaEntity visita);

}