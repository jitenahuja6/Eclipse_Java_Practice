package com.jiten.practice1;

public class OddEvenArray {
	
	public static  void main(String[]args)
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int evensize = 0; 
		int oddsize = 0;
		
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				evensize ++;
				
			}
			else
			{
				oddsize++;
			}
		}
		
		int even[] = new int[evensize];
		int odd[] = new int[oddsize];
		
		int e = 0; 
		int o = 0;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] % 2 ==0)
			{
				even[e++] = arr[i];
			}
			else
			{
				odd[o++] = arr[i];
			}
		}
		System.out.println("The odd no is");
		printarray(odd);
		System.out.println("The even no is");
		printarray(even);
	}
	
	public static void printarray(int arr[])
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
