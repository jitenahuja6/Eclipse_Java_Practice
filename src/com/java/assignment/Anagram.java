package com.java.assignment;

import java.util.Arrays;

public class Anagram {
	
	public static boolean isanagram(char[] str1, char[] str2)
	{
		int n1 = str1.length;
		int n2 = str2.length;
		
		if(n1!=n2)
		{
			return false;
		}
		
	   Arrays.sort(str1);
	   Arrays.sort(str2);
	   
	   for(int i = 0; i<n1; i++)
	   {
		   if(str1[i]!=str2[i])
		   {
			   return false;
		   }
	   }
	   return true;
	}
	
	public static void main(String[] args) {
		
		char str1[] = {'n', 'o', 'w'};
		char str2[] = {'o', 'w', 'n'};
		
		if(isanagram(str1, str2))
		{
			System.out.println("Its anagram");
		}
		else
		{
			System.out.println("Its not anagram");
		}
	}

}
