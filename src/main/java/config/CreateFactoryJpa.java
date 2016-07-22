package config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CreateFactoryJpa {
	private CreateFactoryJpa() {

	}
	
	private static EntityManagerFactory emf = getEntityManagerFactory();

	private static EntityManagerFactory getEntityManagerFactory() {
		if (emf == null)
			emf = Persistence.createEntityManagerFactory("ServletjpaJunit");
		return emf;
	}

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}
