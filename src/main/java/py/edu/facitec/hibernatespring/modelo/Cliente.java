package py.edu.facitec.hibernatespring.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
	@Id
	@GeneratedValue
	private Integer id;
	private String nombre;
	private String correo;
	
	@OneToMany(mappedBy="cliente")
	private List<Pedido> pedidos;
	

}
