package com.jiten.practice1;

public class RotateArray {
	static int N = 4;
public static void main(String[] args) {
	
	 int arr[][] = { { 1, 2, 3, 4 },
             { 5, 6, 7, 8 },
             { 9, 10, 11, 12 },
             { 13, 14, 15, 16 } };
	rotatearraybyninety(arr);
	printarray(arr);
	
	
	
}

public static void rotatearraybyninety(int arr[][])
{
	for(int i = 0; i<N/2; i++)
	{
		for(int j = i ; j<N-i-1; j++)
		{
			int temp = arr[i][j];
			arr[i][j] = arr[N -1 -j][i];
			arr[N -1 -j][i] = arr[N -1 -i][N-1-j];
			arr[N -1 -i][N -1 -j] = arr[j][N -1 -i];
			arr[j][N-1-i] = temp;
		}
	}
}


public static void printarray(int arr[][])
{
	for(int i = 0; i<N; i++)
	{
		for(int j = 0; j<N; j++)
		{
			System.out.print(arr[i][j] + " ");
		}
			System.out.println();
		
	}
}





}
