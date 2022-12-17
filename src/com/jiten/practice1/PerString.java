package com.jiten.practice1;

public class PerString {
	
	public static void main(String[] args) {
		
		String str = "abb";
		String ans = "";
		
		findpermut(str,ans);
	}
	
	public static void findpermut(String str, String ans)
	{
		if(str.length() == 0)
		{
			System.out.println(ans);
		}
		
		for(int i = 0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			String ros = (str.substring(0, i) + str.substring(i + 1));
			findpermut(ros, ans + c);
		}
	}

}
