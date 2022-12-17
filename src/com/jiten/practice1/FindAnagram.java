package com.jiten.practice1;

import java.util.Arrays;

public class FindAnagram {
	
	public static void main(String[] args) {
		
	char a[] = "abc".toCharArray();
	char b[] = "bpc".toCharArray();
	
	if(isanagram(a,b))
	{
		System.out.println("Its anagram");
	}
	else
	{
		System.out.println("Its not anagram");
	}
	}
	
	public static boolean isanagram(char a[], char b[])
	{
		if(a.length != b.length)
		{
			return false;
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] != b[i])
			{
				return false;
			}
		}
		return true;
		
		
		
		
		
		
		
	}
	
	
	
	

}
