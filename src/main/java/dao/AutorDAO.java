package dao;

import entity.Autor;

public class AutorDAO extends GenericDAO<Autor>{
	public AutorDAO() {
		super(Autor.class);
	}
	@Override
	public void save(Autor entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}
}
