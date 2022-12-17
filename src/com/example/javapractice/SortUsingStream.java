package com.example.javapractice;

import java.util.Arrays;
import java.util.List;

public class SortUsingStream {
	public static void main(String[] args) {
		
		List<Integer> obj = Arrays.asList(5,4,3);
		obj.stream().sorted().forEach(System.out::println);
	}

}
