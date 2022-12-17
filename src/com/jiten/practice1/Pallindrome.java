package com.jiten.practice1;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();
		String reverse = "";
		for(int i = k.length() - 1; i>=0; i--)
		{
			reverse = reverse + k.charAt(i);
		}
		System.out.println(reverse);
	}

}
