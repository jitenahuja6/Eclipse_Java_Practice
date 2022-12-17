package com.jiten.practice1;

import java.util.Arrays;

public class AnagramCompare {
	
	public static void main(String[] args) {
		
		char str1[] = {'a', 'b', 'a'};
		char str2[] = {'b', 'a', 'a'};
		
		if(anagram(str1, str2))
		{
			System.out.println("Its anagram");
		}
		else
		{
			System.out.println("Its not anagram");
		}
	}
	
	public static boolean anagram(char[] str1, char[] str2)
	{
		
		
		if(str1.length != str2.length)
		{
			return false;
		}
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i = 0; i<str1.length; i++)
		{
			if(str1[i] != str2[i])
			{
				return false;
			}
		}
		return true;
	}

}
