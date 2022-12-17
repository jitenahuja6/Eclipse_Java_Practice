package com.example.inheritance1;

public interface Employer {
	public default void run()
	{
		System.out.println("second interface in running state");
	}

}
