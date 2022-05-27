package br.eti.cvm.mapstructcycle.mapper;

import br.eti.cvm.mapstructcycle.dto.ChildDto;
import br.eti.cvm.mapstructcycle.model.Child;
import org.mapstruct.AfterMapping;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(uses=MotherMapper.class)
public interface ChildMapper {

    ChildDto toDto(Child entity, @Context CycleAvoidingMappingContext context);

    @AfterMapping
    default void ChildNullinMother(@MappingTarget ChildDto dto) {
        if(dto.getMother() != null) {
            dto.getMother().setChildren(null);
        }
    }
}
