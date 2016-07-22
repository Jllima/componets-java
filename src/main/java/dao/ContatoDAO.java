package dao;

import repository.ContatoRepository;
import entity.Contato;

public class ContatoDAO extends GenericDAO<Contato> implements
		ContatoRepository {
	public ContatoDAO() {
		super(Contato.class);
	}

	@Override
	public void create(Contato contato) {


	}
}
