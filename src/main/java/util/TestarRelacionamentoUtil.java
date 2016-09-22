package util;

import javax.persistence.EntityManager;

import config.CreateFactoryJpa;
import dao.AutorDAO;
import dao.LivroDAO;
import entity.Autor;
import entity.Livro;

public class TestarRelacionamentoUtil {
	public static void main(String[] args) {
		EntityManager em = CreateFactoryJpa.getEntityManager();
		em.getTransaction().begin();
		
		Autor autor = new Autor();
		autor.setNome("Goku");
		
		Livro livro = new Livro();
		livro.setNome("Dragon Ball");
		livro.getAutores().add(autor);
		
		em.persist(autor);
		em.persist(livro);
		
		em.getTransaction().commit();
		em.close();
	}
}
