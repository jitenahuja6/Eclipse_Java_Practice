package com.jiten.practice1;

public class FinallyExample {
	
	public static void main(String[] args) {
		
		try
		{
			int k = 25/0;
		}catch(NullPointerException e)
		{
			
			System.out.println(e);
			
		}
		
		finally
		{
			System.out.println("These will be executed doesnt matter wheather exception is handled or not");
		}
	}

}
