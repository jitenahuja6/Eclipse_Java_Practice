package com.jiten.practice;

public class EvenOddUsingThread {
	
	int count = 1;
	int n = 10;
	
	public void printoddnumbers()
	{
		synchronized(this)
		{
		while(count < n)
		{
			while(count % 2 ==0)
			{
				try
				{
					wait();
				}catch(Exception e)
				{
					e.printStackTrace();
					System.out.println(e);
				}
			}
			
			System.out.println(count);
			count++;
			notify();
		}
	}}
	
	public void printevennumbers()
	{
		synchronized(this)
		{
		while(count <n)
		{
			while(count % 2 == 1)
			{
				try
				{
					wait();
				}catch(Exception e)
				{
					e.printStackTrace();
					System.out.println(e);
				}
			}
			
			System.out.println(count);
			count++;
			notify();
		}
	}}
	
	public static void main(String[] args) {
			
	EvenOddUsingThread obj = new EvenOddUsingThread();
	Thread t1 = new Thread(new Runnable()
			{
				public void run()
				{
				obj.printoddnumbers();	
				}
			});
			
	Thread t2 = new Thread(new Runnable()
			{
				public void run()
				{
					obj.printevennumbers();
				}
			});
	
	t1.start();
	t2.start();

}}
