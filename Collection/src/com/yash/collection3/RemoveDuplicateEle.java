package com.yash.collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateEle {

	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(10);
		list.add(50);
		list.add(40);

		Collections.sort(list);
		System.out.println("Before remove duplicate: "+list);
		
		Set<Integer> duplicate= new TreeSet<>(list);
		System.out.println("After duplicate remove: ");
		for(int num:duplicate) {
			System.out.println(num);
		}

	}

}
