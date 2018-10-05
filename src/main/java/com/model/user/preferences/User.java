package com.model.user.preferences;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String email;
	
	@Column
	private Integer contactNumber;
	
}
