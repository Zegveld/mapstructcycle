package br.eti.cvm.mapstructcycle.mapper;

import br.eti.cvm.mapstructcycle.dto.MotherDto;
import br.eti.cvm.mapstructcycle.model.Mother;
import org.mapstruct.*;

@Named("MotherMapper")
@Mapper(uses=ChildMapper.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MotherMapper {

    @Named("toDto")
    @Mappings({
        @Mapping(target = "children", qualifiedByName = {"ChildMapper", "toDtoWithoutMother"})
    })
    MotherDto toDto(Mother entity);

    @Named("toDtoWithoutChildren")
    @Mappings({
        @Mapping(target = "children", ignore = true)
    })
    MotherDto toDtoWithoutChildren(Mother entity);

}
