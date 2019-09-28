package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {

}