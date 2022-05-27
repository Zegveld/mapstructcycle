package br.eti.cvm.mapstructcycle.controller;

import br.eti.cvm.mapstructcycle.dto.ChildDto;
import br.eti.cvm.mapstructcycle.mapper.ChildMapper;
import br.eti.cvm.mapstructcycle.mapper.CycleAvoidingMappingContext;
import br.eti.cvm.mapstructcycle.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/child")
public class ChildController {

    @Autowired
    private ChildRepository childRepository;

    @Autowired
    private ChildMapper childMapper;

    @GetMapping()
    public Set<ChildDto> listChildren() {

        Set<ChildDto> children = new HashSet<>();

        childRepository.findAll().forEach(child -> children.add(childMapper.toDto(child, new CycleAvoidingMappingContext())));

        return children;
    }

}

