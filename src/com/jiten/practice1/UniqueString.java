package com.jiten.practice1;

public class UniqueString {
	
	public static void main(String[] args) {
		
		String str = "the";
		int j;
		for(int i = 0; i<str.length(); i++)
		{
			boolean flag  =false;
			for( j = 0; j<str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j) && i!=j)
				{
					flag = true;
					 
				}
				
			}
			if(flag == false)
			{
				System.out.println(str.charAt(i));
			}
			
		}
	}}