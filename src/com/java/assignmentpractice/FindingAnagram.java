package com.java.assignmentpractice;

public class FindingAnagram {
	static int N = 256;
public static void main(String[] args) {
	
	String str[] = {"eat","tea","tan","ate","nat","bat"};
	int n = str.length;
	ifanagram(str, n);
}

public static void ifanagram(String str[], int n)
{
	int i , j;
	
	for(i = 0; i<n; i++)
	{
		for(j = i + 1; j<n; j++)
		{
			if(areanagram(str[i], str[j]))
			{
				System.out.println(str[i] + " is anagram of" + str[j]);
			}
		}
	}
}

public static boolean areanagram(String str1, String str2)
{
	int count[] = new int[N];
	boolean flag = true;
	
	if(str1.length() != str2.length())
	{
		flag = false;
		
	}
	
	int i ;
	
	for(i = 0; i<str1.length() && i<str2.length(); i++)
	{
		count[str1.charAt(i)]++;
		count[str2.charAt(i)]--;
		
	}
	
	for(i = 0; i<N; i++)
	{
		if(count[i] != 0)
		{
			flag = false;
		}
	}
	return flag;
	
}







}
