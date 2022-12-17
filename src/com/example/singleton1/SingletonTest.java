package com.example.singleton1;

public class SingletonTest {
	
	public static void main(String[] args) {
		
		Abc obj = Abc.getInstance();
		Abc obj1 = Abc.getInstance();
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}

}
