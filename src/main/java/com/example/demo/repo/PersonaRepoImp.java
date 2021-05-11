package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Repository
public class PersonaRepoImp implements IPersonaRepo {

	private static final Logger log = (Logger) LoggerFactory.getLogger(PersonaRepoImp.class);
	
	@Override
	public Flux<Persona> Listar() {
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona (1,"jhon",27));
		personas.add(new Persona (2,"juan ",28));
		personas.add(new Persona (3,"ana ",29));
		
		return Flux.fromIterable(personas);
						
		}

	@Override
	public Flux<Persona> ListarPorId(Integer id) {

		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona (1,"jhon",27));
		personas.add(new Persona (2,"juan ",28));
		personas.add(new Persona (3,"ana ",29));
		
		return Flux.fromIterable(personas).filter(p -> p.getIdPersona() == id);
		
	}

	@Override
	public Mono<Persona> EliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		return Mono.empty();
	}

}
