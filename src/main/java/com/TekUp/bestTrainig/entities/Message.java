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
public class Message {

	@Id
	 private int message_id;
	 
	    private Date date_message;

	    private String contenu;
	    
	    
	    @ManyToOne(cascade = CascadeType.PERSIST)
	    @JoinColumn(name = "user_id")
	     private User user;
}
