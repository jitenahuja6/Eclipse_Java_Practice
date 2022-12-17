package com.jiten.practice1;

public class SeperateOddAndEven {

	public static void main(String[]args)
	{
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int n = arr.length;
		
		int even =0;
		int odd = 0;
		
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		int evensize[] = new int[even];
		int oddsize[] = new int[odd];
		
		int e = 0;
		int o = 0;
		
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] %2 == 0)
			{
				evensize[e++] = arr[i];
			}
			else
			{
				oddsize[o++] = arr[i];
			}
		}
		System.out.println("The odd no is");
		
				printarr(oddsize);
		System.out.println("The even no is");
			printarr(evensize);
		
			
		}
		
		
	
	public static void printarr(int arr[])
	{
		for(int i =0; i<arr.length; i++)

		{
			System.out.println(arr[i]);
		}
		
	}
	
	
	
}
