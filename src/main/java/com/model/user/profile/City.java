package com.model.user.profile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	@Column
	private Float longitude;
	
	@Column
	private Float latitude;
	
	@Column
	private String zipCode;
	
	private Country country;
	
}
