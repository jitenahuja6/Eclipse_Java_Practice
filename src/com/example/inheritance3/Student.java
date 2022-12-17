package com.example.inheritance3;

public interface Student {
	public default void guide()
	{
		System.out.println("Student is learning");
	}

}
