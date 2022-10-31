package com.TekUp.bestTrainig.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TekUp.bestTrainig.entities.Etablissement;
import com.TekUp.bestTrainig.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

}
