package com.TekUp.bestTrainig.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TekUp.bestTrainig.entities.Etablissement;

@Repository
public interface EtalissementRepository extends JpaRepository<Etablissement, Integer> {

}
