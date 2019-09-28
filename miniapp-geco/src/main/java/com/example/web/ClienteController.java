package com.example.web;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Cliente;
import com.example.services.ClienteService;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public Iterable<Cliente> all() {
		return clienteService.all();
	}

	@GetMapping("/{id}")
	public Optional<Cliente> get(@PathVariable Integer id) {
		return clienteService.getById(id);
	}

	@PostMapping
	public Cliente create(@Valid @RequestBody Cliente cliente) {
		return clienteService.create(cliente);
	}

	@PutMapping("/{id}")
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Integer id) {
		return clienteService.update(cliente);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		clienteService.delete(id);
	}
}