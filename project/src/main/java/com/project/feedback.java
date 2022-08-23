package com.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	private String name, feedback;

	

	public feedback() {
		super();
		// TODO Auto-generated constructor stub
	}



	public feedback(int id, String name, String feedback) {
		this.name = name;
		this.feedback = feedback;
		this.id=id;
	}



	
}
