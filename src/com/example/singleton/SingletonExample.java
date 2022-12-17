package com.example.singleton;

public class SingletonExample {
	
	public static SingletonExample sin = new SingletonExample();
	
	private SingletonExample()
	{
		
	}
	
	public static SingletonExample getInstance()
	{
		return sin;
	}

}
