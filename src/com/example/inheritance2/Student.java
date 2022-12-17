package com.example.inheritance2;

public interface Student {
	public default void  run()
	{
		System.out.println("Its running fast");
	}

}
