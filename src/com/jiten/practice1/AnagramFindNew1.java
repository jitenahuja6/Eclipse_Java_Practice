package com.jiten.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramFindNew1 {
	public static void main(String[] args) {
		
		String str[] = { "cat", "dog", "tac", "god", "act" };
		printanagram(str);
	}
	
	public static void printanagram(String str[])
	{
		HashMap<String, List<String>> map = new HashMap<>();
		for(int i = 0; i<str.length; i++)
		{
			String word = str[i];
			char letters[] = word.toCharArray();
			Arrays.sort(letters);
			String newword = new String(letters);
			if(map.containsKey(newword))
			{
				map.get(newword).add(word);
			}
			else
			{
				List<String> words = new ArrayList<>();
				words.add(word);
				map.put(newword, words);
				
			}
			
		}
		for(String str1 : map.keySet())
		{
			List<String> str2 = map.get(str1);
			if(str2.size() > 1)
			{
				System.out.println(str2);
			}
		}
		
		
		
		
	}
	

}
