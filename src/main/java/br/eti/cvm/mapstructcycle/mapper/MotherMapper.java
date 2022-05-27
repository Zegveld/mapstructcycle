package br.eti.cvm.mapstructcycle.mapper;

import br.eti.cvm.mapstructcycle.dto.MotherDto;
import br.eti.cvm.mapstructcycle.model.Mother;
import org.mapstruct.AfterMapping;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(uses=ChildMapper.class)
public interface MotherMapper {

    MotherDto toDto(Mother entity, @Context CycleAvoidingMappingContext context);

    @AfterMapping
    default public void MotherNullinChild(@MappingTarget MotherDto dto) {
        if(dto.getChildren() != null) {
            dto.getChildren().forEach(child -> {child.setMother(null);});
        }
    }

}
