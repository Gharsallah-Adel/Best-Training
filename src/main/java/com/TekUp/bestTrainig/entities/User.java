package com.TekUp.bestTrainig.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;

	private int CIN;

	private String nom;

	private String prenom;

	private String password;

	/*private int tel;

	//private String genre;

	private String email;

	private String classe;

	private String Specialite;

	private String Payes;*/

	@ManyToOne
	@JoinColumn(name = "etablissement_id", nullable = false)
	private Etablissement etablissement;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Message> messages;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Notification> notifications;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getCIN() {
		return CIN;
	}

	public void setCIN(int cIN) {
		CIN = cIN;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getSpecialite() {
		return Specialite;
	}

	public void setSpecialite(String specialite) {
		Specialite = specialite;
	}

	public String getPayes() {
		return Payes;
	}

	public void setPayes(String payes) {
		Payes = payes;
	}
*/
	public Etablissement getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(Etablissement etablissement) {
		this.etablissement = etablissement;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

}
