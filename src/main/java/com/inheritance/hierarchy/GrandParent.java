package com.inheritance.hierarchy;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class GrandParent extends GreatGrandParent implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column
	private String grandParentName;

	@Column
	private String grandParentMotherName;

	public String getGrandParentName() {
		return grandParentName;
	}

	public void setGrandParentName(String grandParentName) {
		this.grandParentName = grandParentName;
	}

	public String getGrandParentMotherName() {
		return grandParentMotherName;
	}

	public void setGrandParentMotherName(String grandParentMotherName) {
		this.grandParentMotherName = grandParentMotherName;
	}

}
