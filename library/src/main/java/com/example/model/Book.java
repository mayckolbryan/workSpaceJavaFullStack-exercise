/**
 * 
 */
package com.example.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author BRYAN
 *
 */
@Entity
public class Book {
	
	@Id
	private int id;
	
	@Column(name="titulo" , length=200)
	private String titulo;
	
	@Column(name="autor" , length=100)
	private String autor;
	
	@Column(name="fechaPublicacion")
	private LocalDate fechaPublicacion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
}
