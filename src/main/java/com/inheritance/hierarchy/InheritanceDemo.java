package com.inheritance.hierarchy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class InheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("weather");
		EntityManager em = emf.createEntityManager();
		
		GreatGrandParent greatGrandParent = new GreatGrandParent();
		GrandParent grandParent = new GrandParent();
		Parent parent = new Parent();
		Son son = new Son();
		
		greatGrandParent.setGreatGrandParentName("greatGrandParent");
		grandParent.setGrandParentName("grandParentName");
		grandParent.setGrandParentMotherName("grandParentMotherName");
		parent.setParentName("parentName");
		son.setName("son");
		
		em.getTransaction().begin();
		em.persist(greatGrandParent);
		em.persist(grandParent);
		em.persist(parent);
		em.persist(son);
		em.getTransaction().commit();
		
		System.out.println(son.getId());
		TypedQuery<Son> querySonInfo = em.createNamedQuery("Son.findById", Son.class);
		querySonInfo.setParameter("id", son.getId());
		Son sonInfo = querySonInfo.getSingleResult();
		System.out.println("Son info *****");
		System.out.println(sonInfo.getGrandParentMotherName());
		System.out.println(sonInfo.getId());
	}
}
