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

import com.edovalm.models.entity.Raza;
import com.edovalm.models.services.RazaService;

@RestController
@RequestMapping("/api/razas")
public class RazaController {
	@Autowired
	private RazaService razaService;
	
	@GetMapping("/{id}")
	public Optional<Raza> buscarPorId(@PathVariable Integer id){
		return razaService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Raza> listar(){
		return razaService.findAll();
	}
	
	@PostMapping
	public Raza guardar(@RequestBody Raza raza) {
		return razaService.save(raza);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		razaService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Raza actualizar(@RequestBody Raza raza , @PathVariable Integer id) {
		Raza razEnBD = razaService.findById(id).get();
		razEnBD.setNombreRaza(raza.getNombreRaza()); 
		razEnBD.setImgRaza(raza.getImgRaza()); 
		razEnBD.setDescripcionRaza(raza.getDescripcionRaza());
		razaService.save(razEnBD);
		return raza;
	}
}
