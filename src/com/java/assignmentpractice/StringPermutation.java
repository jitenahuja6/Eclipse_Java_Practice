package com.java.assignmentpractice;

public class StringPermutation {
	
	public static void main(String[] args) {
		
		String str = "abb";
		 
		String ans = " ";
		printpermutation(str,ans);
	}
	
	public static void printpermutation(String str, String ans)
	{
		if(str.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i = 0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			String ros = (str.substring(0,i) + str.substring(i + 1));
			printpermutation(ros, ans + c);
		}
	}

}
