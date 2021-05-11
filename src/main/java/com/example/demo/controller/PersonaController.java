package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.repo.IPersonaRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(PersonaController.class);
	
	@Autowired
	private IPersonaRepo repo;

	@GetMapping
	public Flux<Persona> listar(){
		return repo.Listar();
	}
	
	
	@GetMapping("/{id}")
	public Flux<Persona> filtrarId(@PathVariable("id") Integer id){
		return repo.ListarPorId(id);
	}

	@DeleteMapping("/{id}")
	public Mono<Persona> deleteId(@PathVariable("id") Integer id){
		return repo.EliminarPorId(id);
	}
}
