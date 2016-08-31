package py.edu.facitec.hibernatespring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.hibernatespring.modelo.Cliente;

@Repository 
public class ClienteDao { 
 
 	@PersistenceContext 
private EntityManager manager; 
 public void save(Cliente cliente){  	
	 
	 manager.persist(cliente); 
 	} 
} 

