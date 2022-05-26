package br.eti.cvm.mapstructcycle.controller;

import br.eti.cvm.mapstructcycle.dto.MotherDto;
import br.eti.cvm.mapstructcycle.mapper.CycleAvoidingMappingContext;
import br.eti.cvm.mapstructcycle.mapper.MotherMapper;
import br.eti.cvm.mapstructcycle.repository.MotherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mother")
public class MotherController {

    @Autowired
    private MotherRepository motherRepository;

    @Autowired
    private MotherMapper motherMapper;

    @GetMapping()
    public MotherDto showMother() {
        return motherMapper.toDto(motherRepository.findById(1L).get(), new CycleAvoidingMappingContext());
    }

}
