package com.jiten.practice1;

import java.awt.Window;
import java.util.ArrayList;

public class SystemGCExample1 {
	
	 public static void main(String args[]) {
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        arrayList.add(4187);
	        arrayList.add(5263);
	 
	        // assign null to arrayList 
	        arrayList = null; 
	        System.out.println(arrayList);
	 
	        // requesting JVM for running Garbage Collector 
	        System.gc();
	        System.out.println(arrayList);
	    }
	}