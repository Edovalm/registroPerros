package com.edovalm.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edovalm.models.entity.Perro;
import com.edovalm.models.services.PerroService;

@RestController
@RequestMapping("/api/perros")
public class PerroController {
	@Autowired
	private PerroService perroService;
	
	@GetMapping("/{id}")
	public Optional<Perro> buscarPorId(@PathVariable Integer id){
		return perroService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Perro> listar(){
		return perroService.findAll();
	}
	
	@PostMapping
	public Perro guardar(@RequestBody Perro perro) {
		return perroService.save(perro);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		perroService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Perro actualizar(@RequestBody Perro perro , @PathVariable Integer id) {
		Perro perEnBD = perroService.findById(id).get();
		perEnBD.setNombrePerro(perro.getNombrePerro()); 
		perEnBD.setImgPerro(perro.getImgPerro()); 
		perEnBD.setRazaPerro(perro.getRazaPerro());
		perEnBD.setDueñoPerro(perro.getDueñoPerro());
		perroService.save(perEnBD);
		return perro;
	}
}
