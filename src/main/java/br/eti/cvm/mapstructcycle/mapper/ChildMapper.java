package br.eti.cvm.mapstructcycle.mapper;

import br.eti.cvm.mapstructcycle.dto.ChildDto;
import br.eti.cvm.mapstructcycle.model.Child;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(uses=MotherMapper.class)
public interface ChildMapper {

    Child toEntity(ChildDto dto);

    ChildDto toDto(Child entity);

    Set<Child> toEntity(Set<ChildDto> dto);

    Set<ChildDto> toDto(Set<Child> entity);

}
