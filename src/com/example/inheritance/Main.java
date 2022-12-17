package com.example.inheritance;

public class Main implements Interface1, Interface2 {
	
	public void run()
	{
		Interface1.super.run();
		Interface2.super.run();
	}
	
	public static void main(String[] args) {
		
		Main obj = new Main();
		obj.run();
	}
}
	
	