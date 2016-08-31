package py.edu.facitec.springtaller.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.hibernatespring.dao.ClienteDao;
import py.edu.facitec.hibernatespring.modelo.Cliente;

@Transactional 
@Controller 
public class ClienteController { 
 
@Autowired 
 	private ClienteDao clienteDao; 
 	 
 	@RequestMapping("/clientes") 
 	public String save(Cliente cliente){ 
 	 
 	System.out.println("Registrando el cliente: "+cliente); 
 	 	clienteDao.save(cliente); 
 	 	 
 	 	return "/clientes/ok"; 
 	} 	 
 	@RequestMapping("/clientes/formulario") 
 	public String formulario(){ 
 	 	 
 	 	return "/clientes/formulario"; 
 	} 

 
} 
