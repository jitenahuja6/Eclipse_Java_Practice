package com.example.javapractice;

public class EvenAndOddThread {
	
	int n = 10;
	int count = 1;
	
	public void printodd()
	{
		synchronized(this)
		{
			for(int i = 1; i<n; i++)
			{
				if(n % 2 ==0)
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
	
	public void printeven()
	{
		synchronized(this)
		{
			for(int i = 1; i<n; i++)
			{
				if(n % 2!=0)
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
		
		EvenAndOddThread obj = new EvenAndOddThread();
		Thread t1 = new Thread(new Runnable()
				{
					public void run()
					{
						obj.printodd();
					}
				});
		
		Thread t2 = new Thread(new Runnable()
				{
					public void run()
					{
						obj.printeven();
					}
				});
		
		t1.start();
		t2.start();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
