package com.jiten.practice1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		
		Map obj = new HashMap();
		obj.put(1, "rahul");
		obj.put(2, "ravi");
		obj.put(3, "rahul");
		
		Set set = obj.entrySet();
		Iterator list = set.iterator();
		while(list.hasNext())
		{
			Map.Entry map = (Map.Entry)list.next();
			System.out.println(map.getKey() + " "+map.getValue());
		}
		
		
	}

}
