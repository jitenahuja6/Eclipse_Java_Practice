package com.jiten.practice1;

public class CountString {
	
	public static int count(String str, char c)
	{
		int result = 0;
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i) == c)
			{
				result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		char c = 'e';
		System.out.println(count(str, c));
	}

}
