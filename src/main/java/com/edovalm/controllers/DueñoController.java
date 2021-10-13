package com.edovalm.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edovalm.models.entity.Dueño;
import com.edovalm.models.services.DueñoService;

@RestController
@RequestMapping("/api/dueños")
@CrossOrigin("*")
public class DueñoController {
	@Autowired
	private DueñoService dueñoService;
	
	@GetMapping("/{id}")
	public Optional<Dueño> buscarPorId(@PathVariable Integer id){
		return dueñoService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Dueño> listar(){
		return dueñoService.findAll();
	}
	
	@PostMapping
	public Dueño guardar(@RequestBody Dueño dueño) {
		return dueñoService.save(dueño);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		dueñoService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Dueño actualizar(@RequestBody Dueño dueño , @PathVariable Integer id) {
		Dueño dueEnBD = dueñoService.findById(id).get();
		dueEnBD.setNombreDueño(dueño.getNombreDueño()); 
		dueEnBD.setImgDueño(dueño.getImgDueño()); 
		dueñoService.save(dueEnBD);
		return dueño;
	}
}
