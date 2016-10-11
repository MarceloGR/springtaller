package py.edu.facitec.hibernatespring.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.hibernatespring.modelo.Pedido;



@Repository
public class PedidoDao extends DAOGenerico<Pedido> {
	@PersistenceContext
	private EntityManager em;

	public PedidoDao() {
		super(Pedido.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	

}
