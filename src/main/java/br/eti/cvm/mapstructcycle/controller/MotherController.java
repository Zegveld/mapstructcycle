package br.eti.cvm.mapstructcycle.controller;

import br.eti.cvm.mapstructcycle.dto.MotherDto;
import br.eti.cvm.mapstructcycle.mapper.MotherMapper;
import br.eti.cvm.mapstructcycle.repository.MotherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/mother")
public class MotherController {

    @Autowired
    private MotherRepository motherRepository;

    @Autowired
    private MotherMapper motherMapper;

    @GetMapping()
    public Set<MotherDto> listAllMothers() {
        Set<MotherDto> mothers = new HashSet<>();

        motherRepository.findAll().forEach(mother -> mothers.add(motherMapper.toDto(mother)));

        return mothers;
    }

}
