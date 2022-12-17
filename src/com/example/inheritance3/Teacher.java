package com.example.inheritance3;

public interface Teacher {
public default void guide()
{
	System.out.println("Teacher is teaching");
}
}
