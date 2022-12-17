package com.example.builderpattern1;

public class StudentBuilder {
	
	public int age;
	public String name;
	public String address;
	public StudentBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public StudentBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	
	public Student getStudent()
	{
			return new Student(age,address,  name);
	}

}
