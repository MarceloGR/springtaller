package py.edu.facitec.hibernatespring.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class ItemPedido {
	@Id
	@GeneratedValue
	private long id;
	
	private int cantidadProducto;
	private double subtotal;
	
	@ManyToOne
	private Pedido pedido;
	
	@OneToMany(mappedBy= "itemPedido")
	private List<Pedido> pedidos;
	
	@ManyToOne
	private Producto producto;
	

}
