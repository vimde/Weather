package com.model.user.profile;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.model.user.preferences.User;

@Entity
public class UserCity {

	private User user;
	
	private City city;
	
	@Column
	private LocalDate addedOn;
}
