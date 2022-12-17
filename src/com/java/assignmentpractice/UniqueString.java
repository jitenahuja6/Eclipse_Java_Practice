package com.java.assignmentpractice;

public class UniqueString {
	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		for(int i = 0; i<str.length(); i++)
		{
			boolean flag = false;
			for(int j = 0; j<str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j)  && i != j )
				{
					flag = true;
				}
			}
			if(flag == false)
			{
				System.out.print(str.charAt(i));
			}
		}
	}

}
