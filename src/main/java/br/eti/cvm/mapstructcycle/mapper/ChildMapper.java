package br.eti.cvm.mapstructcycle.mapper;

import br.eti.cvm.mapstructcycle.dto.ChildDto;
import br.eti.cvm.mapstructcycle.model.Child;
import org.mapstruct.Context;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(uses=MotherMapper.class)
public interface ChildMapper {

    Child toEntity(ChildDto dto, @Context CycleAvoidingMappingContext context);

    ChildDto toDto(Child entity, @Context CycleAvoidingMappingContext context);

    Set<Child> toEntity(Set<ChildDto> dto, @Context CycleAvoidingMappingContext context);

    Set<ChildDto> toDto(Set<Child> entity, @Context CycleAvoidingMappingContext context);

}
