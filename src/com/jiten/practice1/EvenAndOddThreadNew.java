package com.jiten.practice1;

public class EvenAndOddThreadNew {
int count = 1; 
int n = 10;

public  void printodd()
{
	synchronized(this)
	{
	while(count<n)
	{
		while(count%2 == 0)
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
				while(count<n)
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
	
	EvenAndOddThreadNew obj = new EvenAndOddThreadNew();
	
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
	



