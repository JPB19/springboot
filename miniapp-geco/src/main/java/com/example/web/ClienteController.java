package com.example.web;

import java.util.List;

@Api(value="Cliente Controller")
@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@ApiOperation(value = "Muestra la lista de clientes", response = List.class)
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