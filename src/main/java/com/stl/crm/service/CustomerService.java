package com.stl.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stl.crm.domain.Customer;
import com.stl.crm.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	/**
	 * get all customers
	 * @return
	 */
	public Iterable<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	/**
	 * get a customer based on the customerId
	 * @param customerId
	 * @return
	 */
	public Customer getCustomer(long customerId) {
		return customerRepository.findOne(customerId);
	}
	
	/**
	 * update existing customer
	 * @param customerId
	 * @param customer
	 * @return
	 */
	public Customer updateCustomer(long customerId, Customer customer) {
		return customerRepository.save(customer);
		
	}

	/**
	 * add a customer 
	 * @param customer
	 * @return
	 */
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}	
 
	/**
	 * delete a customer
	 * @param customer
	 */
	public void deleteCustomer(Customer customer) {
		customerRepository.delete(customer);
	}

}
