package com.example.inheritance1;

public class Main implements Employee, Employer {
	public void run()
	{
		Employee.super.run();
		Employer.super.run();
		
		
	}
	public static void main(String[] args) {
		
		Main m = new Main();
		m.run();
	}

}
