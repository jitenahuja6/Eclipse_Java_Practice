package com.jiten.practice1;

public class OddEvenThread extends Thread {
	
	int n= 10; 
	int count = 1;
	
	public void printoddnumber()
	{
		synchronized(this)
		{
		while(count < n)
		{
			while(count % 2 == 0)
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
	
	public void printevennumber()
	{
		synchronized(this)
		{
			while(count < n)
			{
				while(count % 2 == 1)
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
		
		OddEvenThread obj = new OddEvenThread();
		Thread t1 = new Thread(new Runnable()
				{
					
					public void run()
					{
						obj.printoddnumber();
					}
				});
		
		Thread t2 = new Thread(new Runnable()
				{
					public void run()
					{
						obj.printevennumber();
					}
				});
		t1.start();
		t2.start();
		
	}}
	
	
