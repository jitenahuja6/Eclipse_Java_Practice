package com.jiten.practice1;

public class StringUnique {
	
	public static void main(String[] args) {
		
		String str="raman";
		int n = str.length();
		
		for(int i = 0; i<n; i++)
		{
			boolean flag = true;
			for(int j = 0; j<n; j++)
			{
				if(str.charAt(i) == str.charAt(j)  && i!=j)
				{
					flag = false;
				}}
			
			if(flag == true)
			{
				System.out.print(str.charAt(i));
				
			}
		}
	}

}
