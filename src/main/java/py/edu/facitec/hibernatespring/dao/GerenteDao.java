package py.edu.facitec.hibernatespring.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.hibernatespring.modelo.Gerente;


@Repository
public class GerenteDao extends DAOGenerico<Gerente> {
	@PersistenceContext
	private EntityManager em;
	
	public GerenteDao() {
		super(Gerente.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
