package com.jiten.practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String input = sc.nextLine();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : input.toCharArray())
		{
			if(map.containsKey(c))
			{
				int a = map.get(c);
				map.replace(c, a+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> b : map.entrySet())
{
			if(b.getValue() > 1) {
	     System.out.println(b.getKey() + " " +b.getValue());
}}}
}
		
