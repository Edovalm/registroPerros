package com.edovalm.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dueños")
public class Dueño {
	@Id 
	@Column(name = "id_dueño")
	private Integer idDueño;
	
	@Column(name = "nombre_dueño")
	private String nombreDueño;
	
	@Column(name = "img_dueño")
	private String imgDueño;

	public Integer getIdDueño() {
		return idDueño;
	}

	public void setIdDueño(Integer idDueño) {
		this.idDueño = idDueño;
	}

	public String getNombreDueño() {
		return nombreDueño;
	}

	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}

	public String getImgDueño() {
		return imgDueño;
	}

	public void setImgDueño(String imgDueño) {
		this.imgDueño = imgDueño;
	}

	@Override
	public String toString() {
		return "Dueño [idDueño=" + idDueño + ", nombreDueño=" + nombreDueño + ", imgDueño=" + imgDueño + "]";
	}
}
