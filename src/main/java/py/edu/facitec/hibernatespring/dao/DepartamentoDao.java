package py.edu.facitec.hibernatespring.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.hibernatespring.modelo.Departamento;


@Repository
public class DepartamentoDao extends DAOGenerico<Departamento> {
	@PersistenceContext
	private EntityManager em;

	public DepartamentoDao() {
		super(Departamento.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}

