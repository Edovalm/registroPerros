package com.edovalm.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "razas")
public class Raza {
	@Id 
	@Column(name = "id_raza")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRaza;
	
	@Column(name = "nombre_raza")
	private String nombreRaza;
	
	@Column(name = "img_raza")
	private String imgRaza;

	@Column(name = "descripcion_raza")
	private String descripcionRaza;

	public Integer getIdRaza() {
		return idRaza;
	}

	public void setIdRaza(Integer idRaza) {
		this.idRaza = idRaza;
	}

	public String getNombreRaza() {
		return nombreRaza;
	}

	public void setNombreRaza(String nombreRaza) {
		this.nombreRaza = nombreRaza;
	}

	public String getImgRaza() {
		return imgRaza;
	}

	public void setImgRaza(String imgRaza) {
		this.imgRaza = imgRaza;
	}

	public String getDescripcionRaza() {
		return descripcionRaza;
	}

	public void setDescripcionRaza(String descripcionRaza) {
		this.descripcionRaza = descripcionRaza;
	}

	@Override
	public String toString() {
		return "Raza [idRaza=" + idRaza + ", nombreRaza=" + nombreRaza + ", imgRaza=" + imgRaza + ", descripcionRaza="
				+ descripcionRaza + "]";
	}
}
