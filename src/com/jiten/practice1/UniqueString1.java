package com.jiten.practice1;

public class UniqueString1 {
	
	public static void main(String[] args) {
		
		char str[]  = "gforg".toCharArray();
		
		
		for(int i = 0; i<str.length; i++)
		{
			int count = 1;
			for(int j = 0; j< str.length; j++)
			{
				if(str[i] == str[j] && i != j)
					count++;
			}
			if(count == 1)
			{
				System.out.print(str[i]);
			}
		}
		
	}

}
