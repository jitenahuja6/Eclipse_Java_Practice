package com.example.java8;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		
		Predicate<Integer> obj = (i -> i%2 ==0);
		System.out.println(obj.test(25));
	}

}
