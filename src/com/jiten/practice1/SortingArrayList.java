package com.jiten.practice1;

public class SortingArrayList {
	public static void main(String[] args) {
		
		int arr[] = {1,3,5,6,2};
		int n = arr.length;
		int temp;
		for(int i = 0; i< n; i++)
		{
			for(int j = i + 1; j<n; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		for(int i = 0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
