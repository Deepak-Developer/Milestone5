package com.milestone5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.milestone5.entity.Customer;
import com.milestone5.repository.CustomerRepo;

import ch.qos.logback.core.status.Status;

@SpringBootTest
@AutoConfigureMockMvc
class Milestone5ApplicationTests {
	
	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	void contextLoads() throws JsonProcessingException, Exception {
		Customer customer = new Customer(2, "King", "Male", 23, "Veg");
		
		mockMvc.perform(MockMvcRequestBuilders.post("/customer/register").contentType(MediaType.APPLICATION_JSON)
				.content(new ObjectMapper().writeValueAsString(customer))).andExpect(MockMvcResultMatchers.status().isOk());
	}

}
