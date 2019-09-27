package com.example.web;

import java.util.List;

@Api(value="Producto Controller")
@RestController
@RequestMapping(path = "/producto")
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@ApiOperation(value = "Muestra la lista de productos", response = List.class)
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
