package com.thinkxfactor.zomatoplus.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.thinkxfactor.zomatoplus.model.Admin;
import com.thinkxfactor.zomatoplus.repository.AdminRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class AdminController {
	
	//HashMap<Integer, Admin> adminMap = new HashMap<>();
	AdminRepository admin;
	
	 @GetMapping("/admin")	 
	 public Admin getAdmin(@RequestParam int id) {
		 //return adminMap.get(id);
		 return admin.findById(id).get();
	 }
	 @GetMapping("/getadmin")	 
	 public Collection<Admin> getAll() {
		 //return adminMap;
		 return admin.findAll();
	 }
	 
	 
	 @PostMapping("/save")
	 public Admin saveAdmin(@RequestBody Admin ad) {
		 //ad.setId(1);
		 //adminMap.put(ad.getId(),ad);
		 //return(ad);
		 admin.save(ad);
		 return(ad);
	 }

}
