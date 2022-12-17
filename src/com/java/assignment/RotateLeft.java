package com.java.assignment;

public class RotateLeft {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int len = arr.length;
		for(int i = 0; i<len; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println();
		
		int n = 3;
		for(int i = 0; i< n; i++)
		{
			int k = arr[i];
			int j;
			for( j = 0; j<arr.length - 1; j++)
			{
				arr[j] = arr[j + 1];
			}
			arr[j] = k;
			
			
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
