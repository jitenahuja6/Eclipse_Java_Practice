package com.jiten.practice;

public class Deadlockexample 
{
	public static void main(String[] args) {
		
		final String resource1 = "Rahul";
		final String resource2 = "Ravi";
		
		Thread t1 = new Thread()
		{
			public void run()
			{
				synchronized (resource1)
				{
					System.out.println("Threadd1 have caught resource1");
				
				synchronized (resource2)
				{
					System.out.println("Thread1 have caught resource 2");
				}
				}
			}
		};
		
		Thread t2 = new Thread()
		{
			public void run()
			{
		
			synchronized (resource2)
			{
				System.out.println("Thread2 have locked resource2");
			
				
			synchronized (resource1)
			{
				System.out.println("Thread2 have locked resource1");
			}
			
			
			
		
		
			
		}
		
	}};
	
	t1.start();
	t2.start();

}}
