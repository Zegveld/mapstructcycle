package br.eti.cvm.mapstructcycle.repository;

import br.eti.cvm.mapstructcycle.model.Mother;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherRepository extends CrudRepository<Mother, Long> {
}
