package com.milestone5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.milestone5.entity.Customer;
import com.milestone5.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public Customer save(Customer customer) {
		return customerRepo.save(customer);
	}
	
	public Customer findById(Integer id) {
		return customerRepo.findById(id).get();
	}
	
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
	
}
