package com.java.assignmentpractice;

import java.util.Arrays;

public class RemoveDupllicates {
	
	public static void main(String[] args) {
		
		char str[] = "raam".toCharArray();
		int n = str.length;
		System.out.println(printduplicates(str,n));
	}
	
	public static String printduplicates(char str[], int n)
	{
		int index = 0;
		int i,j;
		for( i =0; i<n; i++)
		{
			for( j = 0; j<i; j++)
			{
				if(str[i] == str[j])
				{
					break;
				}}
				if(j==i)
				{
					str[index++] = str[i];
				}
			}
			
		
		 
		return String.valueOf(Arrays.copyOf(str, index));
	}

}
