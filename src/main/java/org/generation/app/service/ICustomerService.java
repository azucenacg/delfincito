package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.Customer;

public interface ICustomerService {
	/**
	 * Enlista todos los clientes de la base de datos 
	 * @return
	 */
	public List<Customer> findAllCustomers();
	/**
	 * Nos guarda el cliente en la base de datos
	 * 
	 * @param customer datos del cliente
	 * @return devuelve el cliente con el Id asignado
	 */
	public Customer save(Customer customer);
	/**
	 * Elimina un cliente en la base de datos
	 * @param id identificador del cliente a buscar 
	 */
	public void deleteCustomerById(Long id);
	/**
	 * Encontrar un cliente en la base de datos
	 * @param id identificador del cliente a buscar 
	 * @return
	 */
	public Customer findCustomerById(Long id);
}