package util;

import javax.persistence.EntityManager;

import config.CreateFactoryJpa;

public class GerarTabelasUtil {

	public static void main(String[] args) {
		EntityManager em = CreateFactoryJpa.getEntityManager();
		em.close();
	}
}
