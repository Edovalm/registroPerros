package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edovalm.models.entity.Perro;
import com.edovalm.repository.PerroRepository;

@Service
public class PerroServiceImpl implements PerroService {
	@Autowired
	private PerroRepository perroRepository;

	@Override
	public List<Perro> findAll() {
		return perroRepository.findAll();
	}

	@Override
	public Optional<Perro> findById(Integer id) {
		return perroRepository.findById(id);
	}

	@Override
	public Perro save(Perro perro) {
		return perroRepository.save(perro);
	}

	@Override
	public void deleteById(Integer id) {
		perroRepository.deleteById(id);
	}
}