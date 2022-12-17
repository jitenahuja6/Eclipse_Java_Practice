package com.example.builderpattern;

public class PhoneBuilder {

	
	String name;
	String address;
	String model;
	int cost;
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PhoneBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	public PhoneBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	public PhoneBuilder setCost(int cost) {
		this.cost = cost;
		return this;
	}
	
	
	public Phone getPhone()
	{
		return new Phone(name,address,model,cost);
	}
	
	
}
