package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Cliente;
import com.example.repository.ClienteRepository;


/**
 * Servicios de clientes.
 * 
 * @author Julián Boschi
 * @see Cliente
 * @see ClienteRepository
 */
@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repository;

	/**
	 * Retorna la lista de clientes.
	 * 
	 * @return lista de clientes
	 */
	public Iterable<Cliente> all() {
		return repository.findAll();
	}

	/**
	 * Busca un Cliente por Id.
	 * 
	 * @param id id de cliente a buscar
	 * @return cliente existente
	 */
	public Optional<Cliente> getById(Integer id) {

		Optional<Cliente> clienteOptional = this.repository.findById(id);

		if (clienteOptional.isPresent()) {
			return clienteOptional;
		} else {
			return Optional.empty();
		}

	}

	/**
	 * Crea un nuevo cliente.
	 * 
	 * @param cliente cliente a crear
	 * @return nuevo cliente
	 */
	public Cliente create(Cliente cliente) {
		return repository.save(cliente);
	}

	/**
	 * Actualiza cliente existente.
	 * 
	 * @param cliente cliente a actualizar
	 * @return cliente actualizado
	 */
	public Cliente update(Cliente cliente) {
		return repository.save(cliente);
	}

	/**
	 * Borra cliente existente.
	 * 
	 * @param id id de cliente a eliminar
	 */
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}