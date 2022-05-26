package br.eti.cvm.mapstructcycle.mapper;

import br.eti.cvm.mapstructcycle.dto.ChildDto;
import br.eti.cvm.mapstructcycle.model.Child;
import org.mapstruct.*;

@Named("ChildMapper")
@Mapper(uses=MotherMapper.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ChildMapper {

    @Named("toDto")
    @Mappings({
        @Mapping(target = "mother", qualifiedByName = {"MotherMapper", "toDtoWithoutChildren"})
    })
    ChildDto toDto(Child entity);

    @Named("toDtoWithoutMother")
    @Mappings({
            @Mapping(target = "mother", ignore = true)})
    ChildDto toDtoWithoutMother(Child child);

}
