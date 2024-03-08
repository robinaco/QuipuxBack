package tech.getarrays.employeemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Cancion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	@NotNull(message = "titulo may not be null")
	private String titulo;
	private String artista;
	private String album;
	private String anno;
	private String genero;
	
	
	public Cancion() {}
	
	public Cancion(Long id, String titulo, String artista, String album, String anno, String genero) {
		this.id = id;
		this.titulo = titulo;
		this.artista = artista;
		this.album = album;
		this.anno = anno;
		this.genero = genero;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAnno() {
		return anno;
	}
	public void setAnno(String anno) {
		this.anno = anno;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}



	
}
