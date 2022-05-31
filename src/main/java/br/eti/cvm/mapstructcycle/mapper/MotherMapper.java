package br.eti.cvm.mapstructcycle.mapper;

import br.eti.cvm.mapstructcycle.dto.MotherDto;
import br.eti.cvm.mapstructcycle.model.Mother;

import org.mapstruct.Context;
import org.mapstruct.Mapper;

@Mapper( uses = ChildMapper.class, componentModel = "spring" )
public interface MotherMapper {

    MotherDto toDto(Mother entity, @Context CycleAvoidingMappingContext context);

}
