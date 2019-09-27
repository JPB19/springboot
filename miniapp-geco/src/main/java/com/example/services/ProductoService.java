package com.example.services;

import java.util.Optional;


/**
 * Servicios de productos.
 * 
 * @author Julián Boschi
 * @see Producto
 * @see ProductoRepository
 */
@Service
public class ProductoService {
	@Autowired
	private ProductoRepository repository;

	/**
	 * Retorna la lista de productos.
	 * 
	 * @return lista de productos
	 */
	public Iterable<Producto> all() {
		return repository.findAll();
	}

	/**
	 * Busca un Producto por Id.
	 * 
	 * @param id id de producto a buscar
	 * @return producto existente
	 */
	public Optional<Producto> getById(Integer id) {

		Optional<Producto> productoOptional = this.repository.findById(id);

		if (productoOptional.isPresent()) {
			return productoOptional;
		} else {
			return Optional.empty();
		}

	}

	/**
	 * Crea un nuevo producto.
	 * 
	 * @param producto producto a crear
	 * @return nuevo producto
	 */
	public Producto create(Producto producto) {
		return repository.save(producto);
	}

	/**
	 * Actualiza producto existente.
	 * 
	 * @param producto producto a actualizar
	 * @return producto actualizado
	 */
	public Producto update(Producto producto) {
		return repository.save(producto);
	}

	/**
	 * Borra producto existente.
	 * 
	 * @param id id de producto a eliminar
	 */
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}