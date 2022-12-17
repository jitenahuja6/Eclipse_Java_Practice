package com.java.assignmentpractice;

public class Oddevenusingthread {
	int n = 10;
	int count = 1;
	
	public void odd()
	{
		synchronized(this)
		{
		while(count <= n)
		{
			while(n % 2 == 0)
			{
				try
				{
					wait();
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
			System.out.println(count);
			count++;
			notify();
		}
	}
	
	}
	
	public void even()
	{
		synchronized(this)
		{
			while(count <= n)
			{
				while(n % 2 == 1)
				{
					try
					{
						wait();
					}catch(Exception e)
					{
						System.out.println(e);
					}
				}
				System.out.println(count);
				count++;
				notify();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Oddevenusingthread obj = new Oddevenusingthread();
		Thread t1 = new Thread(new Runnable()
				{
					public void run()
					{
						obj.odd();
					}
				});
		
		Thread t2 = new Thread(new Runnable()
				{
					public void run()
					{
						obj.even();
					}
				});
		t1.start();
		t2.start();
	}
	
	
	
	
	
	
}
