package com.java.builderpattern;

public class MobileBuilder {
	
	private String name;
	private int age;
	private String address;
	public MobileBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public MobileBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public MobileBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	
	public Mobile getMobile() {
		return new Mobile(name,age,address);
	}
	
	

}
