package com.example.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		
		SingletonExample obj = SingletonExample.getInstance();
		SingletonExample obj1 = SingletonExample.getInstance();
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}

}
