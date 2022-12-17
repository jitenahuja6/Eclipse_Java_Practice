package com.jiten.practice1;

public class PermutationString2 {

	public static void main(String[] args) {
		
		String str = "bcd";
		String ans = " ";
		checkpermutation(str,ans);
	}
	
	public static void  checkpermutation(String str, String ans)
	{
		if(str.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i = 0; i<str.length(); i++)
		{
			char a = str.charAt(i);
			String ros = (str.substring(0,i) + str.substring(i + 1));
			checkpermutation(ros, ans + a);
		}
	}
	
	
}
