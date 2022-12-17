package com.example.builderpattern1;

public class Student {
	
	public int age;
	public String name;
	public String address;
	public Student(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
