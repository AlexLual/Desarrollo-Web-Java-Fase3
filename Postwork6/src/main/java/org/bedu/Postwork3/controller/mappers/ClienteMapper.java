package org.bedu.Postwork3.controller.mappers;
import org.bedu.Postwork3.persistence.entities.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    Cliente clienteModelToClienteEntity(org.bedu.Postwork3.model.Cliente clienteModel);

    org.bedu.Postwork3.model.Cliente clienteEntityToClienteModel(Cliente cliente);
}
