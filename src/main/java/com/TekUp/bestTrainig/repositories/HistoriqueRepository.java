package com.TekUp.bestTrainig.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TekUp.bestTrainig.entities.Historique;


@Repository
public interface HistoriqueRepository  extends JpaRepository<Historique, Integer>{

}
