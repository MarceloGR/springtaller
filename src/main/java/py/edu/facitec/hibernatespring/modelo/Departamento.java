package py.edu.facitec.hibernatespring.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Departamento {
	
	@Id
	@GeneratedValue
	private long id;
	private String descripcion;
	
	
	@OneToOne //indicamos que es una relacion de uno a uno	
	private Gerente gerente;
	
	@OneToMany(mappedBy="departamento")
	private List<Usuario> usuarios;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", descripcion=" + descripcion + ", gerente=" + gerente + ", usuarios="
				+ usuarios + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	

}
