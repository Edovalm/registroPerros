package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edovalm.models.entity.Dueño;
import com.edovalm.repository.DueñoRepository;

@Service
public class DueñoServiceImpl implements DueñoService {
	@Autowired
	private DueñoRepository dueñoRepository;

	@Override
	public List<Dueño> findAll() {
		return dueñoRepository.findAll();
	}

	@Override
	public Optional<Dueño> findById(Integer id) {
		return dueñoRepository.findById(id);
	}

	@Override
	public Dueño save(Dueño dueño) {
		return dueñoRepository.save(dueño);
	}

	@Override
	public void deleteById(Integer id) {
		dueñoRepository.deleteById(id);
	}
}
