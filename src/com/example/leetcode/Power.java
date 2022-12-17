package com.example.leetcode;

public class Power {
	
	public static double myPow(double x , int n)
	{
		if (n == 0) return 1.0;
        if (n == 1) return x;
        if (n == -1) return 1 / x;
        double sqrt = myPow(x, n / 2);
        return sqrt * sqrt * myPow(x, n % 2);
	}
	
	public static void main(String[] args) {
		
		double x = 2 ;
		int n = -2;
		
		System.out.println(myPow(x,n));
	}

}
