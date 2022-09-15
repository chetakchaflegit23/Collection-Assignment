package com.yash.collection5;

import java.util.Collections;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) 
	{
		Vector<String> vector=new Vector<>();
		vector.add("chetak");
		vector.add("akash");
		vector.add("mayur");
		
		System.out.println("Before sorting: "+vector);
		
		Collections.sort(vector);
		System.out.println("After sorting: ");
		for(String s:vector) {
			System.out.println(s);
		}
	
	}

}
