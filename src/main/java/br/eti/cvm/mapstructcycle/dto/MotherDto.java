package br.eti.cvm.mapstructcycle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MotherDto {

    private long id;

    private String name;

    private Set<ChildDto> children;

}
