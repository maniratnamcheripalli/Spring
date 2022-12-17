package com.constructer;

public class Person {
	
	private String id;
	private int id1;
	private String name;
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Person(int id1, String name) {
		super();
		this.id1 = id1;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
