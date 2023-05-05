package com.raush.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connectionclass {
	
	static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("P_Connect");
	}
	
	public static EntityManager getconnection() {
		
		EntityManager em=emf.createEntityManager();
		return em;
		
	}

}
