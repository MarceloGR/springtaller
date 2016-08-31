package py.edu.facitec.hibernatespring.modelo;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Pedido {
	@Id
	@GeneratedValue
	private Long id;
	private Date fechaToma;
	private Date fechaEntrega;
	private double total;
	@ManyToOne
	// indicamos que se trata de una relacion de mucho para uno
	// se posibilita la creacion de la clase foraneas
	private Cliente cliente;
	
	@ManyToOne
	private Usuario usuario;
	@OneToMany(mappedBy="pedido")
	private List<ItemPedido> itemPedidos;
	
	

}
