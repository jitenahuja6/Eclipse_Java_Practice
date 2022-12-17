package com.jiten.practice;

import java.util.Arrays;

public class RemoveElement {
	public static  int[] removeelement(int arr[], int n)
	{
		int k = 0;
		int arr_new[] = new int[arr.length - 1] ;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]!= n)
			{
				arr_new[k++] = arr[i];
			}
		}
		
		return arr_new;
		
		
	}
	public static void main(String[] args) {
		int arr[]= {1,3,2,5};
		int n = 2;
		
		int storage[] = removeelement(arr,n);
		for(int i =0; i<storage.length; i++)
		{
			System.out.print(storage[i] + " ");
		}
	}

}
