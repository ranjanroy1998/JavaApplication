package com.CollectionFramwork;

import java.util.*;  
import java.io.*;  

public class TestComparator 
{
	public static void main(String args[])
	{  
		
		ArrayList<StudentD> al = new ArrayList<StudentD>();  
		al.add(new StudentD(101,"Vijay",23));  
		al.add(new StudentD(106,"Ajay",27));  
		al.add(new StudentD(105,"Jai",21));  
		  
		System.out.println("Sorting by Name");  
		Collections.sort(al,new NameComparator());  
		
		for(StudentD st: al)
		{  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("sorting by Age");  
		Collections.sort(al,new AgeComparator());  
		
		for(StudentD st: al)
		{  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
	}  
  
}
