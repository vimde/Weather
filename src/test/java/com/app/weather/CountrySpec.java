package com.app.weather;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.BeforeClass;
import org.junit.Test;

import com.model.user.profile.Country;


public class CountrySpec {

	private static EntityManagerFactory entityManagerFactory;
	
	@BeforeClass
	public static void setup() {
		entityManagerFactory = Persistence.createEntityManagerFactory("weather");
	}
	
	@Test
	public void countryShouldBeSaved() {
		Country india = new Country();
		india.setName("India");
		Country brazil = new Country();
		brazil.setName("Brazil");
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("weather");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(india);
			entityManager.persist(brazil);
			entityManager.getTransaction().commit();
			TypedQuery<Country> countries = entityManager.createQuery("SELECT c FROM Country c", Country.class);
			countries.getResultList().stream().forEach(System.out::println);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}
}
