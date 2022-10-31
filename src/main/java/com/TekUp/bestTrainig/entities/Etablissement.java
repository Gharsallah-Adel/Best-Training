package com.TekUp.bestTrainig.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etablissement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int etablissement_id;

	private String nom;

	private String specialite;

	private String adresse;

	private String password;

	private String email;

	private int tel;

	@OneToMany(mappedBy = "etablissement", fetch = FetchType.LAZY)
	private List<User> user;

	@OneToMany(mappedBy = "etablissement", fetch = FetchType.LAZY)
	private List<Offre> offres;

}
