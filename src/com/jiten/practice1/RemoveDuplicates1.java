package com.jiten.practice1;

import java.util.Arrays;

public class RemoveDuplicates1 {
	public static void main(String[] args) {
		
		char str[] = "raam".toCharArray();
		int n = str.length;
		System.out.println(printwithoutduplicate(str,n));
	}
	
	public static String printwithoutduplicate(char []str, int n)
	{
		int index = 0;
		
		int i, j;
		
		for(i=0; i<n; i++)
		{
			for(j=0; j<i; j++)
			{
				if(str[i] == str[j])
					break;
			}
			if(j==i)
			{
				str[index++] = str[i];
			}
		}
		
		return String.valueOf(Arrays.copyOf(str, index));
	}

}
