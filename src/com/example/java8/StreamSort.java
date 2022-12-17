package com.example.java8;

import java.util.Arrays;
import java.util.List;

public class StreamSort {
	public static void main(String[] args) {
		
		List<Integer> obj = Arrays.asList(1,3,2,4);
		obj.stream().sorted().forEach(System.out::println);
	}

}
