package com.example.synchronization;

public class Math {
  
 
synchronized void run( int n)
	 {
	   for(int i=1; i<=n; i++)
	{
		System.out.println(n * i);
	}
}
}
