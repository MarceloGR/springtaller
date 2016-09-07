package py.edu.facitec.hibernatespring.dao;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class DAOGenerico<T> {
	private Class<T> entityclass;
	
	public DAOGenerico(Class<T> entityclass) {
		this.entityclass=entityclass;
		
		
		
		
	

	
		
	}
	protected abstract EntityManager getEntityManager();
	
	public void insertar(T entity){
		getEntityManager().persist(entity);
		
		
	}
	public void atualizar(T entity){
		getEntityManager().merge(entity);
		
	}
	public void eliminar(T entity){
		getEntityManager().remove(getEntityManager().contains(entity)?
				entity:getEntityManager().merge(entity));
	}
	public T buscar(Object id){
		
return getEntityManager().find(entityclass, id);  

		
	}
	public List<T> buscarTodo(){ //obtener el resultado 
		return getEntityManager().createQuery("from "+entityclass.getSimpleName(),entityclass).getResultList();
		
	}
	public void guardar(T entity,Object id){
		if(id==null||id==""){
			insertar(entity);
			
			
		}else{
			if(buscar(id)==null){
				
			insertar(entity);
			
		}else{
			atualizar(entity);
		}
			
		}
	}

}
