package com.example.synchronization;

public class Main {
	public static void main(String[] args) {
		
		Math ma = new Math();
		Thread1 t1 = new Thread1(ma);
		Thread2 t2 = new Thread2(ma);
		
		t1.start();
		t2.start();
	}

}
