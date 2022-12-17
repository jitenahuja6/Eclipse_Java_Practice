package com.jiten.practice1;

public class PrimeNumberRange {
		public static boolean prime(int n)
		{
			boolean flag = true;
			if(n < 2)
			{
				return false;
			}
			
			for(int i =2 ; i<n; i++)
			{
				if(n%i==0)
				{
					flag = false;
				}
			}
			return flag;
		}
		
		public static void main(String[] args) {
			
			int low = 1;
			int high = 50;
			
			for(int i = low; i<=high; i++)
			{
				
				if(prime(i))
				{
					System.out.println(i);
				}
		}
	}

}
