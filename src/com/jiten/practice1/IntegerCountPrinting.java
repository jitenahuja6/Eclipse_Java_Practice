package com.jiten.practice1;

import java.util.HashMap;
import java.util.Map;

public class IntegerCountPrinting {
	
	public static void main(String[] args) {
		
	
	
	int arr[] = {1,3,2,2,3};
	int n = arr.length;
	
	HashMap<Integer,Integer> obj = new HashMap<>();
	for(int i = 0; i<n; i++)
	{
		if(obj.containsKey(arr[i]))
		{
			int a = obj.get(arr[i]);
			obj.replace(arr[i], a+1);
			
		}
		else
		{
			obj.put(arr[i], 1);
		}
	}
	
	for(Map.Entry<Integer, Integer> mp : obj.entrySet())
	{
		System.out.println(mp.getKey() + " " + mp.getValue());
	}

}}
