package com.jiten.practice1;

public class DuplicateWord {
public static void main(String[] args) {
	
	String input = "there is a black dog which is very black";
	input = input.toLowerCase();
	String words[] = input.split(" ");
	int j;
	for(int i = 0; i<words.length; i++)
	{
		int count = 1;
		for( j = i + 1; j<words.length; j++)
		{
			if(words[i].equals(words[j]))
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
