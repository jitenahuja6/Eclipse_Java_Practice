package com.example.builderpattern;

public class Main {
public static void main(String[] args) {
	
	Phone p = new PhoneBuilder().setAddress("Delhi").setCost(90000).getPhone();
	System.out.println(p);

	}
}
