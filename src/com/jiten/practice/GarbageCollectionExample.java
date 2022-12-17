package com.jiten.practice;

public class GarbageCollectionExample {
	public void finalize()
	{
		System.out.println("Its getting clean");
	}
	public static void main(String[] args) {
		
		GarbageCollectionExample obj = new GarbageCollectionExample();
		GarbageCollectionExample obj1 = new GarbageCollectionExample();
		obj1 = null;
		obj = null;
		
		System.gc();
	}

}
