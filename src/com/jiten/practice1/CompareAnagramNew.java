package com.jiten.practice1;

import java.util.Arrays;

public class CompareAnagramNew {
	
	public static void main(String[] args) {
		
		char str1[] = {'a', 'b', 'c',};
		char str2[] = {'a', 'b', 'c'};
		
		if(itsanagram(str1, str2))
		{
			System.out.println("Its anagram");
		}
		else
		{
			System.out.println("Its not anagram");
		}
	}
	
	public static boolean itsanagram(char str1[], char str2[])
	{
		boolean flag = true;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(str1.length != str2.length)
		{
			flag = false;
		}
		for(int i = 0; i<str1.length; i++)
		{
			
			{
				if(str1[i]  != str2[i] )
				{
					flag = false;
				}
			}
		}
		return flag;		
		
	}

}
