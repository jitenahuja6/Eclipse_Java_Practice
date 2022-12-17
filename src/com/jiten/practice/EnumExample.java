package com.jiten.practice;

public class EnumExample {
	
	public enum fruits{Banana,Mango,Grapes,}
	public static void main(String[] args) {
		for(fruits f : fruits.values())
		{
			System.out.println(f);
	}
	}

}
