package com.jiten.practice;

public class FinallyBlockExample {
	
	public static void main(String[] args) {
		
		try
		{
			int k = 25/0;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("These finally block will always be executed");
		}
	}

}
