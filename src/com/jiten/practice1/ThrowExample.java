package com.jiten.practice1;

public class ThrowExample {
	
	public static int check(int n)
	{
		int k;
		if(n<2)
		{
			throw new ArithmeticException("it is less then 2");
			
		}
		else
		{
			k = n*n;
			
		}
		return k;
		
		
	}
	public static void main(String[] args) {
		System.out.println(check(3));
	}

}
