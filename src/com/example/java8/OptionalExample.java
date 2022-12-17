package com.example.java8;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		
		String words[] = new String[10];
		Optional<String> optional = Optional.ofNullable(words[5]);
		if(optional.isPresent())
		{
			System.out.println(words[5].toLowerCase());
		}
		else
		{
			System.out.println("Its null");
		}
	}

}
