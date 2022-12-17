package com.jiten.practice1;

import java.util.Scanner;

public class ReverseSentence {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String str = sc.nextLine();
		String words[] = str.split(" ");
		String reverse = "";
		for(int i = words.length - 1; i>=0; i--)
		{
			reverse = reverse +" " + words[i];
		}
		
		System.out.println(reverse);
	}

}
