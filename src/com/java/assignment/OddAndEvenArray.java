package com.java.assignment;

public class OddAndEvenArray {

public static void printarray(int[] array)
{
int n = array.length;
for(int i = 0; i<n; i++)
{
	System.out.println(array[i]);
}

}
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,6};
	int evensize=0;
	int oddsize =0;
	
	for(int i =0 ; i<arr.length; i++)
	{
		if(arr[i]%2==0)
		{
			evensize++;
		}
		else
		{
			oddsize++;
		}
		
	}
	int e =0;
	int f = 0;
	
	int even[] = new int[evensize];
	int odd[] = new int[oddsize];
	for(int i = 0; i<arr.length; i++)
	{
		if(arr[i]%2==0)
		{
			even[e++] = arr[i];
			
		}
		else
		{
			odd[f++] = arr[i];
 		}
		
		
	}
	
	System.out.println("The odd no is");
	
	printarray(odd);
	
	System.out.println("The even no is");
	printarray(even);
}
}
