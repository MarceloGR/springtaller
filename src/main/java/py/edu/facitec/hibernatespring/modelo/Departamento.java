package py.edu.facitec.hibernatespring.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Departamento {
	@Id
	@GeneratedValue
	private long id;
	private String descripcion;
	private List<Usuario> listaUsuarios;
	@OneToOne
	//indicamos que es una relacion de uno a uno
	private Gerente gerente;
	

}
