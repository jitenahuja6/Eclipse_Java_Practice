package com.java.assignmentpractice;

import java.util.Arrays;

public class CompareAnagram {
	
	public static void main(String[] args) {
		
		char str1[] = "nooq".toCharArray();
		char str2[] = "own".toCharArray();
		
		if(isanagram(str1, str2))
		{
			System.out.println("Its anagram");
		}
		else
		{
			System.out.println("its not anagram");
		}
	}
	
	public static boolean isanagram(char str1[], char str2[])
	{
		boolean flag = true;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(str1.length != str2.length)
		{
			flag = false;
			return flag;
		}
		
		for(int i = 0 ; i<str1.length; i++)
		{
			if(str1[i] != str2[i])
			{
				flag = false;
			}
		}
		return flag;
		
		
		
		
		
	}

}
