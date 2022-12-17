package com.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEven {
	public static void main(String[] args) {
		
		List<Integer> obj = Arrays.asList(1,3,2,4);
		List<Integer> obj1 = obj.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(obj1);
	}

}
