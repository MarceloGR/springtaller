package py.edu.facitec.hibernatespring.modelo;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Producto {
	@Id
	@GeneratedValue
	private long id;
	private String descripcion;
	private Date fechaVencimiento;
	private double precio;
	private Integer cantidad;
	
	@OneToMany(mappedBy="producto" )
	private List<Producto> productos;
	
	
	

}
