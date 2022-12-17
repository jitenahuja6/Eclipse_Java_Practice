package com.jiten.practice1;

public class AnagramFinding {
	static  int a = 256;
	
	public static void main(String[] args) {
		
		String str[] = {"eat","tea","tan","ate","nat","bat"};
		int n = str.length;
		findanagram(str,n);
		
		
	}
	
	public static void findanagram(String str[], int n)
	{
		int i,j;
		for(i =0; i<str.length; i++)
		{
			for(j = i + 1; j<str.length; j++)
			{
				if(areanagram(str[i], str[j]))
				{
					System.out.println(str[i] +"is an anagram of"+ str[2]);
				}
			}
		}
	}
	
	public static boolean areanagram(String str1, String str2)
	{
		
		int count[] = new int[a];
		int i;
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		for( i = 0; i<str1.length() && i<str2.length(); i++)
		{
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		
		for(i=0; i<a; i++)
		{
			if(count[i] != 0)
				{
					return false;
				}
		}
		return true;
		
	}}
	

		
		
		
	