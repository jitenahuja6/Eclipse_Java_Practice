package com.java.assignmentpractice;

import java.util.Arrays;

public class CompareAnagram1 {
	public static void main(String[] args) {
		
	
	
	char str1[] = "abf".toCharArray();
	char str2[] = "bba".toCharArray();
	
	if(compareanagram(str1, str2))
	{
		System.out.println("Its anagram");
	}
	else
	{
		System.out.println("its not an anagram");
	}
		

}
	
	public static boolean compareanagram(char str1[], char str2[])
	{
		Arrays.sort(str1);
		Arrays.sort(str2);
		boolean flag = true;
		if(str1.length != str2.length)
		{
			flag = false;
			return flag;
		}
		
		for(int i =0; i<str1.length; i++)
		{
			for(int j = 0; j<str2.length; j++)
			{
				if(str1[i] != str2[j] && i == j)
				{
					 flag = false;
				}
			}
		
		}
		
		
		return flag;
	}}
