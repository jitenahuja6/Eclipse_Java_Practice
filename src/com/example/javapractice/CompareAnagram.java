package com.example.javapractice;

import java.util.Arrays;

public class CompareAnagram {
	
	public static void main(String[] args) {
		
		char str1[] = "auja".toCharArray();
		char str2[] = "raa".toCharArray();
		
		if(isanagram(str1, str2))
		{
			System.out.println("Its anagram");
		}
		else
		{
			System.out.println("Its not anagram");
		}
 	}
	
	
	public static boolean isanagram(char str1[], char str2[])
	{
		boolean flag = true;
		if(str1.length != str2.length)
		{
			flag = false;
			return flag;
		}
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i = 0; i<str1.length; i++)
		{
			if(str1[i] != str2[i])
			{
				flag = false;
			}
		}
		return flag;
		
		
	}

}
