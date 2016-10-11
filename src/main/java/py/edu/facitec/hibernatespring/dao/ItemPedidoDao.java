package py.edu.facitec.hibernatespring.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.hibernatespring.modelo.ItemPedido;



@Repository
public class ItemPedidoDao extends DAOGenerico<ItemPedido> {
	
	@PersistenceContext
	private EntityManager em;
	
	public ItemPedidoDao() {
		super(ItemPedido.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	

	
	
	

}
