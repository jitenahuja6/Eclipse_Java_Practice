package com.example.abstraction;

public class StudentTest extends Student {
	
		
		public void run()
		{
			System.out.println("Running safely");
		}
		public static void main(String[] args) {
			
			Student obj   = new StudentTest();
			obj.run();
	}

}
