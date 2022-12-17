package com.example.java8;

public class MethodReferenceTest {
	
	public void test()
	{
		System.out.println("Testing");
	}
	
	public static void main(String[] args) {
		
		MethodReference obj = new MethodReferenceTest()::test;
		{
			obj.run();
		}
		
	}

}
