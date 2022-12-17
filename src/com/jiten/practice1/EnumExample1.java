package com.jiten.practice1;

public class EnumExample1 {
	
	public enum Season{summer,winter,cold,}
	public static void main(String[] args) {
		for(Season s: Season.values())
		{
			System.out.println(s);
	}
	}

}
