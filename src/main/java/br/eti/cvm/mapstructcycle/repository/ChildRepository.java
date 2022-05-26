package br.eti.cvm.mapstructcycle.repository;

import br.eti.cvm.mapstructcycle.model.Child;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepository extends CrudRepository<Child, Long> {
}
