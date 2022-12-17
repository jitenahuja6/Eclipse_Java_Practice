package com.jiten.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		
		List<Integer> obj = Arrays.asList(1,3,2,4);
		ListIterator list = obj.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		
		
	}
}
