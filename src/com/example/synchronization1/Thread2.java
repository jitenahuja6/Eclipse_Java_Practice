package com.example.synchronization1;

public class Thread2 extends Thread {
	
		Math m;
		
		Thread2(Math m)
		{
			this.m = m;
		}
		public void run()
		{
			m.run(10);
		}}
