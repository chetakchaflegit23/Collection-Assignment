package com.yash.collection7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test 
{
	 public static void main(String[] args) {



	       List<Student> sl = new ArrayList<Student>();



	       sl.add(new Student(1, "Chetak", "java", 350));
	        sl.add(new Student(2, "Amit", "paython", 250));
	        sl.add(new Student(3, "Mayur", "aws", 200));
	        sl.add(new Student(4, "Sumit", "devoops", 400));
	        sl.add(new Student(5, "Suhas", "data science",102));



	       
	        for (Student student : sl) {



	           int avg = student.getTotalmarks() * 100 / 500;
	           
	           if (avg > 60) {
	                System.out.println("Students above 60% :" + avg);
	                System.out.println(student.getSname());
	           	}
	           if (avg < 50) {
	                System.out.println("Students below 50% :" + avg);
	                System.out.println(student.getSname());
	            }
	            if (avg < 35) {
	                System.out.println("Students below 35% :" + avg);
	                System.out.println(student.getSname());
	            }
	           
	        }

	       execute(sl);
	    }

	   private static void execute(List<Student> sl) {
	        // TODO Auto-generated method stub



	       Collections.sort(sl, new Comparator<Student>() {



	           @Override
	            public int compare(Student o1, Student o2) {
	                String sName1 = o1.getSname();
	                String sName2 = o2.getSname();



	               return sName2.compareTo(sName1);
	            }
	        });
	        System.out.println(sl);
	    }
}
