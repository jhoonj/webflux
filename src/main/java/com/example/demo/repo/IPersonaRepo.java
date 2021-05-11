package com.example.demo.repo;

import com.example.demo.model.Persona;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonaRepo {
	Flux<Persona> Listar();
	Flux<Persona> ListarPorId(Integer id);
	Mono<Persona> EliminarPorId(Integer id);

}
