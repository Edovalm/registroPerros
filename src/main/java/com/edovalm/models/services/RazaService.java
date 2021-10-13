package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import com.edovalm.models.entity.Raza;

public interface RazaService {
	public List<Raza>findAll();
	public Optional<Raza>findById(Integer id);
	public Raza save(Raza raza);
	public void deleteById(Integer id);
}
