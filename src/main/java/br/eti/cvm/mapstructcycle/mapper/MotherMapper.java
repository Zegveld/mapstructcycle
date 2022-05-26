package br.eti.cvm.mapstructcycle.mapper;

import br.eti.cvm.mapstructcycle.dto.MotherDto;
import br.eti.cvm.mapstructcycle.model.Mother;
import org.mapstruct.Context;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(uses=ChildMapper.class)
public interface MotherMapper {

    Mother toEntity(MotherDto dto, @Context CycleAvoidingMappingContext context);

    MotherDto toDto(Mother entity, @Context CycleAvoidingMappingContext context);

    Set<Mother> toEntity(Set<MotherDto> entity, @Context CycleAvoidingMappingContext context);

    Set<MotherDto> toDto(Set<Mother> entity, @Context CycleAvoidingMappingContext context);

}
