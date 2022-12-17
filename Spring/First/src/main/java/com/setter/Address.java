package com.setter;

public class Address {

	private String country;
	private String state;
	private int pinCode;
	
	private Employee emp;
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public Address(String country, String state, int pinCode,Employee emp) {
		super();
		this.country = country;
		this.state = state;
		this.pinCode = pinCode;
		this.emp=emp;
	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", pinCode=" + pinCode + ", emp=" + emp + "]";
	}
	
	

}
