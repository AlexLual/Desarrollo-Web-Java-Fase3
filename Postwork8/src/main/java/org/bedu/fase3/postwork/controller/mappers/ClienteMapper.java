package org.bedu.fase3.postwork.controller.mappers;

import org.bedu.fase3.postwork.persistence.entities.ClienteEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    
    ClienteEntity clienteModelToClienteEntity(org.bedu.fase3.postwork.model.Cliente clienteModel);

    org.bedu.fase3.postwork.model.Cliente clienteEntityToClienteModel(ClienteEntity cliente);

}
