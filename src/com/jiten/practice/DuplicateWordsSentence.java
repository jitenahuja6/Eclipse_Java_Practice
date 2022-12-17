package com.jiten.practice;

public class DuplicateWordsSentence {
	public static void main(String[] args) {
		
		String str = "Big black buket is black only";
		str = str.toLowerCase();
		String words[] = str.split(" ");
		for(int i = 0; i<words.length; i++)
		{
			int count = 1;
			for(int j = i + 1; j<words.length; j++)
			{
				if(words[i] == words[j])
				{
					count++;
					words[j] = "0";
				}
			}
			
			if(count > 1 && words[i] != "0")
			{
				System.out.println(words[i]);
			}
		}
		
	}

}
