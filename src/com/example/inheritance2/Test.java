package com.example.inheritance2;

public class Test implements Student, Principal {
	public void run()
	{
		Principal.super.run();
		Student.super.run();
		
	}
	public static void main(String[] args) {
		
		Test t = new Test();
		t.run();
	}

}
