package com.app.weather;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.model.user.profile.Country;

public class CountrySpec {

	private static EntityManagerFactory entityManagerFactory;

	private static EntityManager entityManager;

	@BeforeClass
	public static void setup() {
		entityManagerFactory = Persistence.createEntityManagerFactory("weather");
		entityManager = entityManagerFactory.createEntityManager();
	}

	@Test
	public void countryShouldBeSaved() {
		
		// Arrange
		Country india = new Country();
		Country brazil = new Country();
		india.setName("India");
		brazil.setName("Brazil");
		
		// Act
		entityManager.getTransaction().begin();
		entityManager.persist(india);
		entityManager.persist(brazil);
		entityManager.getTransaction().commit();
		TypedQuery<Country> retrieveCountry = entityManager.createQuery("SELECT c FROM Country c", Country.class);
		List<String> actualCountryNames = Arrays.asList("India", "Brazil");
		List<String> countryNames = retrieveCountry.getResultList().stream().map(Country::getName).collect(Collectors.toList());
		
		// Assert
		assertThat(countryNames, is(actualCountryNames));
	}

	@AfterClass
	public static void execute() {
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
	}
}
