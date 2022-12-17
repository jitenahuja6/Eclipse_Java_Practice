package com.example.builderpattern1;

public class Main {
public static void main(String[] args) {
	
	Student s = new StudentBuilder().setAddress("Punjab").getStudent();
	System.out.println(s);
}
}
