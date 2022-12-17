package com.example.inheritance1;

public interface Employee {

	public default void run()
	{
		System.out.println("First interface in running state");
	}
}
