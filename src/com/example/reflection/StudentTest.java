package com.example.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class c = Class.forName("com.example.reflection.Student");
		Student s = (Student) c.newInstance();
		Method m = c.getDeclaredMethod("run", null);
		m.setAccessible(true);
		m.invoke(s, null);
		
		
		
	}

}
