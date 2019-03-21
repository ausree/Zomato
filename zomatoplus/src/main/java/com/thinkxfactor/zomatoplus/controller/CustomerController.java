package com.thinkxfactor.zomatoplus.controller;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.model.Customer;


@RestController
@RequestMapping("/user")
public class CustomerController {
	HashMap<Integer, Customer> cusMap = new HashMap<>();

	@GetMapping("/custom")	
	public Customer getCus(@RequestParam int id) {
		 return cusMap.get(id);
	 }
	 
	@GetMapping("/get")	
	 public Collection<Customer> getAll() {
		 return cusMap.values();
	 }
	 
	 
	 @PostMapping("/savecus")
	 public Customer saveCus(@RequestBody Customer cus) {
		 cus.setId(23);
		 cusMap.put(cus.getId(),cus);
		 return(cus);
	 }
	
}
