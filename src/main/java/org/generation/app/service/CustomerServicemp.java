package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.Customer;
import org.generation.app.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServicemp implements ICustomerService{
	
	@Autowired
	ICustomerRepository customerRepository;
	
	@Override
	public List<Customer> findAllCustomers() {
	
		return (List<Customer>)customerRepository.findAll();
	}

	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer deleteCustomerById(Long id) {
		Customer eliminado =findCustomerById(id);
		customerRepository.deleteById(id);
		return eliminado;
	}

	@Override
	public Customer findCustomerById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}


}
