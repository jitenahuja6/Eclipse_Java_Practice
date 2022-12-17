package com.jiten.practice;

public class StaticExample {
	
	static int add(int a, int b)
	{
		return a+b;
		
	}
	static int add(int a, int b, int c)
	{
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
		System.out.println(StaticExample.add(10, 15));
		System.out.println(StaticExample.add(25, 88));
	}

}
