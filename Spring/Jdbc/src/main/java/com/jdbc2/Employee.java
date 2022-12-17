package com.jdbc2;

public class Employee {

	private int id;
	private String name;
	private String position;
	private String company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Employee() {
		super();
	}

	public Employee(int id, String name, String position, String company) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", company=" + company + "]";
	}
	
	

}
