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
public
class ChildrenDto {

    private Set<ChildDto> children;

    public void add(ChildDto childDto) {
        children.add(childDto);
    }

}
