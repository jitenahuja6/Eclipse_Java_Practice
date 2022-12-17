package com.example.javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctCharacterCount {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		String str = sc.nextLine();
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for(char c : str.toCharArray())
		{
			if(map.containsKey(c))
			{
				int k = map.get(c);
				map.replace(c, k+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		
		for(Map.Entry<Character, Integer> a : map.entrySet())
		{
			System.out.println(a.getKey() + " " + a.getValue());
		}
		
	}

}
