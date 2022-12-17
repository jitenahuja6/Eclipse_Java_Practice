package com.jiten.practice1;

import java.util.Arrays;

public class CompareAnagram {
	public static void main(String[] args) {
		
		char str1[] = {'a', 'b', 'c'};
		char str2[] = {'a', 'k', 'c'};
		
		if(areanagram(str1, str2))
		{
			System.out.println("Its anagram");
		}
		else
		{
			System.out.println("Its not anagram");
		}
		
		}
	
	public static boolean areanagram(char str1[], char str2[])
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
			for(int j = 0; j<str1.length; j++)
			{
				if(str1[i] == str2[j] && i != j)
				{
					flag =false;
				}
		}
		
		
		
		
	}
		return flag;
	}}