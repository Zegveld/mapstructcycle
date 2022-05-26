package br.eti.cvm.mapstructcycle.mapper;

import br.eti.cvm.mapstructcycle.dto.MotherDto;
import br.eti.cvm.mapstructcycle.model.Mother;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(uses=ChildMapper.class)
public interface MotherMapper {

    Mother toEntity(MotherDto dto);

    MotherDto toDto(Mother entity);

    Set<Mother> toEntity(Set<MotherDto> entity);

    Set<MotherDto> toDto(Set<Mother> entity);

}
