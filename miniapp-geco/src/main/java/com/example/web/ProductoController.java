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

import com.example.model.Producto;
import com.example.services.ProductoService;

@RestController
@RequestMapping(path = "/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping
	public Iterable<Producto> all() {
		return productoService.all();
	}

	@GetMapping("/{id}")
	public Optional<Producto> get(@PathVariable Integer id) {
		return productoService.getById(id);
	}

	@PostMapping
	public Producto create(@Valid @RequestBody Producto producto) {
		return productoService.create(producto);
	}

	@PutMapping("/{id}")
	public Producto update(@RequestBody Producto producto, @PathVariable Integer id) {
		return productoService.update(producto);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		productoService.delete(id);
	}
}
