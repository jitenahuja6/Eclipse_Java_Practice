package com.java.assignmentpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctCharacterCount {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String input = sc.nextLine();
		
		HashMap<Character, Integer> obj = new HashMap<Character, Integer>();
	    
		for(char c : input.toCharArray())
		{
			if(obj.containsKey(c))
			{
				int k = obj.get(c);
				obj.replace(c, k + 1);
			}
			else
			{
				obj.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> obj1:obj.entrySet())
		{
			System.out.println(obj1.getKey() + " " + obj1.getValue());
		}
		
	}

}
