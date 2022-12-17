package com.example.inheritance2;

public interface Principal {
	public default void run()
	{
		System.out.println("running very fastly on same track");
	}

}
