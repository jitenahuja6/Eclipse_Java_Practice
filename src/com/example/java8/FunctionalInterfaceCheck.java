package com.example.java8;

public class FunctionalInterfaceCheck  {
	public static void main(String[] args) {
		
		int length = 10;
		
		FunctinalInterface obj =()->
		{
			System.out.println("The length is " +length);
		};
		obj.runn();
	}

}
