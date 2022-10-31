package com.TekUp.bestTrainig.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Offre {

	@Id
	private int offre_id;

	private Date date_offre;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "etablissement_id")
	private Etablissement etablissement;

}
