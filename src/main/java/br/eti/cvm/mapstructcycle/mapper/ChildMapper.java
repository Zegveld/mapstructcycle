package br.eti.cvm.mapstructcycle.mapper;

import br.eti.cvm.mapstructcycle.dto.ChildDto;
import br.eti.cvm.mapstructcycle.model.Child;

import org.mapstruct.Context;
import org.mapstruct.Mapper;

@Mapper( uses = MotherMapper.class, componentModel = "spring" )
public interface ChildMapper {

    ChildDto toDto(Child entity, @Context CycleAvoidingMappingContext context);

}
