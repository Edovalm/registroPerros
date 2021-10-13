package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import com.edovalm.models.entity.Perro;

public interface PerroService {
	public List<Perro>findAll();
	public Optional<Perro>findById(Integer id);
	public Perro save(Perro perro);
	public void deleteById(Integer id);
}
