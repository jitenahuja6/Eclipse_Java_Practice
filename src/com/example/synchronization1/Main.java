package com.example.synchronization1;

public class Main {
	
	public static void main(String[] args) {
		
		Math m = new Math();
		Thread1 obj = new Thread1(m);
		Thread2 obj1 = new Thread2(m);
		
		obj.start();
		obj1.start();
	}

}
