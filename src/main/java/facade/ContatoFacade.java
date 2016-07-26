package facade;

import java.io.Serializable;

import dao.ContatoDAO;
import entity.Contato;

public class ContatoFacade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ContatoDAO dao = new ContatoDAO();

	public void createContato(Contato c) {
		dao.beginTrasation();
		dao.save(c);
		dao.commitAndCloseTransaction();
	}
}
