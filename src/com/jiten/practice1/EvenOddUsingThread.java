package com.jiten.practice1;

public class EvenOddUsingThread {
	
	int n = 10;
	int count = 1;
	
	public void evennumber()
	{
		synchronized(this) {
		while(count<n)
		{
			while(count % 2 ==0)
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
	}}}
	
	public void oddnumber()
	{
		synchronized(this) {
		while(count<n)
		{
			while(count%2==1)
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
	}}}
	
	public static void main(String[] args) {
		
		
		EvenOddUsingThread obj = new EvenOddUsingThread();
		Thread t1 = new Thread(new Runnable()
		{
			public void run()
			{
				obj.evennumber();
			}
			
		});
		
		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				obj.oddnumber();
			}
			});
		t1.start();
		t2.start();
	}

}
