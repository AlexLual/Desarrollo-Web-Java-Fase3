package org.bedu.Postwork3.controller.mappers;
import org.bedu.Postwork3.persistence.entities.Visita;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VisitaMapper {
    Visita visitaModelToVisitaEntity(org.bedu.Postwork3.model.Visita visitaModel);

    org.bedu.Postwork3.model.Visita visitaEntityToVisitaModel(Visita visita);
}
