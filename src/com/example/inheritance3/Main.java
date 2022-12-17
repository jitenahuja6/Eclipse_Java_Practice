package com.example.inheritance3;

public class Main implements Student, Teacher {
	
	public void guide()
	{
		Student.super.guide();
		Teacher.super.guide();
	}
	public static void main(String[] args) {
		
		Main m = new Main();
		m.guide();
	}

}
