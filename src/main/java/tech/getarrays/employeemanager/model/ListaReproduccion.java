package tech.getarrays.employeemanager.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class ListaReproduccion implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String nombre;
	private String descripcion;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Cancion> canciones = new ArrayList<>();

	
	public ListaReproduccion () {}
	
	public ListaReproduccion(Long id, String nombre, String descripcion, List<Cancion> canciones) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.canciones = canciones;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}

	@Override
	public String toString() {
		return "ListaReproduccion [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", canciones="
				+ canciones + "]";
	}
}
