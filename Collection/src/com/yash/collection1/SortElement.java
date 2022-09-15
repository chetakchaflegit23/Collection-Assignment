package com.yash.collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SortElement {

	public static void main(String[] args) 
	{ArrayList<String> list=new ArrayList<>();
	list.add("Chetak");
	list.add("Akash");
	list.add("Mayur");
	list.add("Suhas");
	
	System.out.println("Before sorting list: " +list);
	
	Set<String> s=new TreeSet<>(Arrays.asList("Chetak","Akash","Mayur","Suhas"));
	System.out.println("After sorting element: ");
	for(String s1:s) {
		
		System.out.println(s1);
		
		
	}
}

}
