package com.jiten.practice1;

import java.util.Arrays;
import java.util.List;

public class SortingUsingSortMethod {

	public static void main(String[] args) {
		
		List<Integer> obj = Arrays.asList(1,3,2);
		obj.stream().sorted().forEach(System.out::println);
	}
}
