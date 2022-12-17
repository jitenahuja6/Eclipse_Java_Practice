package com.jiten.practice1;

public class RotLeft {

	public static void main(String[] args) {
		
		int n = 3; 
		
		int arr[] = {1,2,3,4,5};
		int l = arr.length;
		int j;
		for(int i =0; i<n; i++)
		{
			int k = arr[i];
			for( j = 0; j<l -1 ; j++)
			{
				arr[j] = arr[j + 1];
			}
			arr[j] = k;
		}
		
		for(int i = 0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
