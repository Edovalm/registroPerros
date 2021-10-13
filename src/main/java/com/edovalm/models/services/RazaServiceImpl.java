package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edovalm.models.entity.Raza;
import com.edovalm.repository.RazaRepository;

@Service
public class RazaServiceImpl implements RazaService {
	@Autowired
	private RazaRepository razaRepository;

	@Override
	public List<Raza> findAll() {
		return razaRepository.findAll();
	}

	@Override
	public Optional<Raza> findById(Integer id) {
		return razaRepository.findById(id);
	}

	@Override
	public Raza save(Raza raza) {
		return razaRepository.save(raza);
	}

	@Override
	public void deleteById(Integer id) {
		razaRepository.deleteById(id);
	}
}
