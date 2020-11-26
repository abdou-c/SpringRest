package sn.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import sn.springrest.entities.Pharmacie;

@Repository
public interface IPharmacie extends JpaRepository<Pharmacie, Integer> {

}
