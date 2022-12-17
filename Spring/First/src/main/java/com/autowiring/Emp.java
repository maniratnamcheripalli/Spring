package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired
	private Address address;
	
	private String name;

//	public Emp(Address address, String name) {
//		super();
//		this.address = address;
//		this.name = name;
//	}
	
//	public Emp(Address address) {
//		System.out.println("Inside constructer");
//	
//		this.address = address;
//	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + ", name=" + name + "]";
	}

	

}
