package com.example.synchronization1;

public class Thread1 extends Thread {
	
	Math m;
	
	Thread1(Math m)
	{
		this.m = m;
	}
	public void run()
	{
		m.run(5);
	}
	

}
