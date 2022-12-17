package com.example.reflection2;

import java.lang.reflect.Method;

public class StudentTest {
	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("com.example.reflection2.Student");
		Student s = (Student) c.newInstance();
		Method m = c.getDeclaredMethod("run", null);
		m.setAccessible(true);
		m.invoke(s, null);
	}

}
