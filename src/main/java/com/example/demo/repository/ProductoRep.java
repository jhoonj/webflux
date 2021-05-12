package com.example.demo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.demo.model.Producto;

public interface ProductoRep extends ReactiveMongoRepository<Producto, String>{

}
