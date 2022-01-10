package com.milestone5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milestone5.entity.Customer;
import com.milestone5.repository.CustomerRepo;
import com.milestone5.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class controller {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/all")
	public List<Customer> findAll() {
		return customerService.findAll();
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> saveAll(@RequestBody Customer customer) {
		Customer cust = customerService.save(customer);
		
		if(cust == null)
			return ResponseEntity.badRequest().body("Customer already exist");
		else
			return ResponseEntity.ok().body(cust);
	}
	
	@GetMapping("/view/{id}")
	public ResponseEntity<?> view(@PathVariable Integer id) {
		Customer customer = customerService.findById(id);
		
		if(customer == null)
			return ResponseEntity.badRequest().body("Customer Does'nt exist for id: " + id );
		else
			return ResponseEntity.ok().body(customer);
		
	}
	
}
