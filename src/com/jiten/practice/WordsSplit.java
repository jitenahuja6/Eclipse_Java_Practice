package com.jiten.practice;

import java.util.regex.Pattern;

public class WordsSplit {
	
	
	public static String reverse(String str)
	{
		Pattern pattern = Pattern.compile("\\s");
		String temp[] = pattern.split(str);
		String rev = "";
		for(int i =temp.length - 1; i>=0; i--)
		{
			
			{
				rev = rev + " "+  temp[i];
			}
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		String str = "Welcome to airport";
		System.out.println(reverse(str));
		
	}}
	
	