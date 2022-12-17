package com.jiten.practice1;

import java.util.Arrays;

public class AnagCompare {
	
	public static void main(String[] args) {
		
		char str1[] = {'a', 'h', 'c'};
		char str2[] = {'b', 'c', 'a'};
		
		if(findanagram(str1, str2))
		{
			System.out.println("Its anagram");
		}
		else
		{
			System.out.println("Its not anagram");
		}
	}
	
	public static boolean findanagram(char str1[], char str2[])
	{
		boolean flag = true;
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i = 0; i<str1.length; i++)
		{
			
				if(str1[i] != str2[i])
				{
					flag  = false;
			}
		}
		return flag;
	}

}
