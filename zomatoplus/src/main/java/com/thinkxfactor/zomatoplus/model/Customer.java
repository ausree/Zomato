package com.thinkxfactor.zomatoplus.model;

public class Customer {
	
	private String name;
	private String email;
	private String address; 
	private int phone;
	private int id;



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}
	

}
