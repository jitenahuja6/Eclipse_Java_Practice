package com.jiten.practice1;

import java.util.Optional;

public class OptionalExample2 {
	
	public static void main(String[] args) {
		String words[] = new String[10];
		Optional<String> optional = Optional.ofNullable(words[5]);
		if(optional.isPresent())
		{
			System.out.println(words[5]);
		}
		else
		{
			System.out.println("Its a null");
		}
				
		
		
	}

}
