package com.edovalm.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "perros")
public class Perro {
	@Id
	@Column(name = "id_perro")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPerro;
	
	@Column(name = "nombre_perro")
	private String nombrePerro;

	@Column(name = "img_perro")
	private String imgPerro;

    @ManyToOne
    @JoinColumn(name = "raza_perro")
	Raza razaPerro;

    @ManyToOne
    @JoinColumn(name = "dueño_perro")
	Dueño dueñoPerro;

	public Integer getIdPerro() {
		return idPerro;
	}

	public void setIdPerro(Integer idPerro) {
		this.idPerro = idPerro;
	}

	public String getNombrePerro() {
		return nombrePerro;
	}

	public void setNombrePerro(String nombrePerro) {
		this.nombrePerro = nombrePerro;
	}

	public String getImgPerro() {
		return imgPerro;
	}

	public void setImgPerro(String imgPerro) {
		this.imgPerro = imgPerro;
	}

	public Raza getRazaPerro() {
		return razaPerro;
	}

	public void setRazaPerro(Raza razaPerro) {
		this.razaPerro = razaPerro;
	}

	public Dueño getDueñoPerro() {
		return dueñoPerro;
	}

	public void setDueñoPerro(Dueño dueñoPerro) {
		this.dueñoPerro = dueñoPerro;
	}

	@Override
	public String toString() {
		return "Perro [idPerro=" + idPerro + ", nombrePerro=" + nombrePerro + ", imgPerro=" + imgPerro + ", razaPerro="
				+ razaPerro + ", dueñoPerro=" + dueñoPerro + "]";
	}
}
