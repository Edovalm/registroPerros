package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import com.edovalm.models.entity.Dueño;

public interface DueñoService {
	public List<Dueño>findAll();
	public Optional<Dueño>findById(Integer id);
	public Dueño save(Dueño dueño);
	public void deleteById(Integer id);
}
