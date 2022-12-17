package com.example.synchronization1;

public class Math {
	synchronized void run(int n)
	{
		for(int i = 0; i<=n; i++)
		{
			System.out.println(n * i);
		}
	}

}
