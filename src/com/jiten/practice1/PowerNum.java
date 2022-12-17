package com.jiten.practice1;

public class PowerNum {
	public static void main(String[] args) {
		
		int x = 5, n =3;
		System.out.println(power(x,n));
	}
	
	public static long power(int x, int n)
	{
		long power = 1L;
		for(int i = 0; i<n; i++)
		{
			power = power * x;
		}
		return power;
	}	}