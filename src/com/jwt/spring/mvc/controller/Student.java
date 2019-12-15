package com.jwt.spring.mvc.controller;

public class Student {
	
	private String firstname;
	private String lastname;
	private Address address;
	
	
	
	public Student(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", getAddress()="
				+ getAddress() + ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	

}
