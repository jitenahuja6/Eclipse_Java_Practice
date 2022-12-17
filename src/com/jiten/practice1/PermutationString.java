package com.jiten.practice1;

public class PermutationString {
	
	public static void main(String[] args) {
		
		String str= "bcd";
		String abc = "";
		printpermut(str, abc);
	}
	
	public static void printpermut(String str, String abc)
	{
		if(str.length() == 0)
		{
			System.out.println(abc);
			return;
		}
		
		for(int i = 0; i<str.length(); i++)
		{
			char a = str.charAt(i);
			String ros = (str.substring(0,i) + str.substring(i + 1));
			printpermut(ros, abc + a);
		}
	}

}
