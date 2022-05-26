package br.eti.cvm.mapstructcycle;

import br.eti.cvm.mapstructcycle.model.Child;
import br.eti.cvm.mapstructcycle.model.Mother;
import br.eti.cvm.mapstructcycle.repository.ChildRepository;
import br.eti.cvm.mapstructcycle.repository.MotherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MapstructcycleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapstructcycleApplication.class, args);
    }

}
