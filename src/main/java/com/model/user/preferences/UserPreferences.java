package com.model.user.preferences;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UserPreferences {

	private User user;
	
	private Attribute attribute;
	
	private MeasuringUnits measuringUnits;
}
