package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRep;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class ProductoController {
	
	@Autowired
	private ProductoRep productoRep;
	
	@PostMapping("/producto")
	public Mono<Producto> addProducto(@RequestBody Producto producto) {
		return productoRep.save(producto);
		
	}

	
}
