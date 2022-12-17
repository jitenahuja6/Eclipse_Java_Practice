package com.jiten.practice1;

public class DeadlockExample1 {
	public static void main(String[] args) {
		
		final String resource1 = "rahul";
		final String resource2 = "ravi";
		
		Thread t1 = new Thread()
				{
					public void run()
					{
						synchronized(resource1)
						{
							System.out.println("Thread1 have caught resource1");
						synchronized(resource2)
						{
							System.out.println("Thread1 have caught resource2");
						}
					}
		}
	};
	
	Thread t2 = new Thread()
			{
				public void run()
				{
					synchronized(resource2)
					{
						System.out.println("Thread2 have caught resource2");
					synchronized(resource1)
					{
						System.out.println("Thread2 have caught resource1");
					}
				}
			}

};

t1.start();
t2.start();

	}}

