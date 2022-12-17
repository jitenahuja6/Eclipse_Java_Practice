package com.jiten.practice1;

public class DuplicateWords {
	
	public static void main(String[]args)
	
	{
		String str = "The man is so hungry that he is hungry";
		str = str.toLowerCase();
		
		String words[] = str.split(" ");
		int n = words.length;
		int j=0;;
		for(int i = 0; i<n; i++)
		{
			int count = 1;
			for( j = i + 1; j<n; j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j] = "O";
				}
			}
			if(count > 1 && words[i] != "O")
			{
				System.out.println(words[i]);
			}
			}}
		}
	

