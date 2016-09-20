package dao;

import entity.Livro;

public class LivroDAO extends GenericDAO<Livro> {
	public LivroDAO() {
		super(Livro.class);
	}

	@Override
	public void save(Livro entity) {
		super.save(entity);
	}
}
