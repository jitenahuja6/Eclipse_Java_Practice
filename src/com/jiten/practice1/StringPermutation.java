package com.jiten.practice1;

public class StringPermutation {
	
	public static void main(String[] args) {
		
		String str = "abc";
		String ans = "";
		checkpermut(str,ans);
	}
	
	public static void checkpermut(String str, String ans)
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
			checkpermut(str,ans + c);
		}
	}

}
