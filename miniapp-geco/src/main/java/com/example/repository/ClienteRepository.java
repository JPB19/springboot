package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}