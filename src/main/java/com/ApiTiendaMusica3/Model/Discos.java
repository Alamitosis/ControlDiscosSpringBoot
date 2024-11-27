package com.ApiTiendaMusica3.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	/*
CREATE TABLE DISCOS(
ID NUMBER PRIMARY KEY,
NOMBRE VARCHAR2(100) NOT NULL,
GENERO VARCHAR2(30) NOT NULL,
PRECIO FLOAT
);
*/
	@Entity
	@Table(name="DISCOS")
	public class discos{
		@Id
		@Column(name="ID",columnDefinition="NUMBER",nullable=false)
		private Long id;
		
		@Column(name="NOMBRE",columnDefinition="VARCHAR2(100)",nullable=false)
		private String nombre;
		
		@Column(name="GENERO",columnDefinition="VARCHAR2(30)",nullable=false)
		private String genero;
		
		@Column(name="PRECIO",columnDefinition="FLOAT",nullable=true)
		private Float precio;

		public discos(Long id, String nombre, String genero, Float precio) {
			this.id = id;
			this.nombre = nombre;
			this.genero = genero;
			this.precio = precio;
		}

		public discos() {
		}

		@Override
		public String toString() {
			return "discos [id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", precio=" + precio + "]\n";
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public Float getPrecio() {
			return precio;
		}

		public void setPrecio(Float precio) {
			this.precio = precio;
		}
		
		
		
	}
