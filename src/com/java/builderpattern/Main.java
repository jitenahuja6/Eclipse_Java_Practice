package com.java.builderpattern;

public class Main {
	public static void main(String[] args) {
		
		Mobile m = new MobileBuilder().setAddress("Bihar").setAge(23).getMobile();
		System.out.println(m);
	}

}
