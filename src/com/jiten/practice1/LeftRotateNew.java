package com.jiten.practice1;

public class LeftRotateNew {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		int n= 3;
		int j;
		for(int i = 0; i<n; i++)
		{
			int k = arr[i];
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
