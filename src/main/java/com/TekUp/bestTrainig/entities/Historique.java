package com.TekUp.bestTrainig.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Historique {

	@Id
	 private int historique_id;
	 
	    private Date date_historique;
	    
	    
	    @ManyToOne(cascade = CascadeType.PERSIST)
	    @JoinColumn(name = "offre_id")
	     private Offre offre;

	
}
