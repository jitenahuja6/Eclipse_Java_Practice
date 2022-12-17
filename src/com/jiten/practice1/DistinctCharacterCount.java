package com.jiten.practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctCharacterCount {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String input = sc.nextLine();
		
		
		HashMap<Character, Integer> obj = new HashMap<>();
		for(char c:input.toCharArray())
		{
			if(obj.containsKey(c))
			{
				int a = obj.get(c);
				obj.replace(c, a+1);
			}
			else
			{
				obj.put(c, 1);
			}
		}
		
		for(Map.Entry<Character,Integer> mp:obj.entrySet())
		{
			System.out.println(mp.getKey() + " "+ mp.getValue());
		}
		
		
	}

}
