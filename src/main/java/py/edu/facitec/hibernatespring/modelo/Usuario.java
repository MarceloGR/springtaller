package py.edu.facitec.hibernatespring.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Usuario{
	@Id	
	private String login;
	private String name;
	private String password;
	@ManyToOne
	private Departamento departamentos;
	@OneToMany(mappedBy="usuario")
	private List<Pedido> pedidos;
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Departamento getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(Departamento departamentos) {
		this.departamentos = departamentos;
	}
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", name=" + name + ", password=" + password + ", departamentos="
				+ departamentos + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
