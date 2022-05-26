package br.eti.cvm.mapstructcycle;

import br.eti.cvm.mapstructcycle.model.Child;
import br.eti.cvm.mapstructcycle.model.Mother;
import br.eti.cvm.mapstructcycle.repository.ChildRepository;
import br.eti.cvm.mapstructcycle.repository.MotherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class RunAfterStartup {

    @Autowired
    private MotherRepository motherRepository;

    @Autowired
    private ChildRepository childRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        initDB();
    }

    private void initDB() {
        Mother mother = new Mother();
        mother.setName("Maria");

        Child child1 = new Child();
        child1.setName("Alex");
        child1.setAge(10);
        child1.setMother(mother);

        Child child2 = new Child();
        child2.setName("Julia");
        child2.setAge(11);
        child2.setMother(mother);

        Set<Child> childrens = new HashSet<>();
        childrens.add(child1);
        childrens.add(child2);
        mother.setChildren(childrens);

        motherRepository.save(mother);
        childRepository.save(child1);
        childRepository.save(child2);
    }

}
