package com.example.builderpattern;

public class Phone {
	
	String name;
	String address;
	String model;
	int cost;
	public Phone(String name, String address, String model, int cost) {
		super();
		this.name = name;
		this.address = address;
		this.model = model;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", address=" + address + ", model=" + model + ", cost=" + cost + "]";
	}
	
	
	
	
	

}
