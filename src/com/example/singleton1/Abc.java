package com.example.singleton1;

public class Abc {
	static Abc obj = new Abc();
	private Abc()
	{
		
	}
	public static Abc getInstance()
	{
		return obj;
	}
}
