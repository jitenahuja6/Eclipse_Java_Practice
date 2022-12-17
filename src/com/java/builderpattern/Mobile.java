package com.java.builderpattern;

public class Mobile {
	private String name;
	private int age;
	private String address;
	public Mobile(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
	
	

}
