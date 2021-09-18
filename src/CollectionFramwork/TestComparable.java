package com.CollectionFramwork;

package Collection;
import java.util.*;  

 
class StudentC implements Comparable<StudentC>
{  
	int rollno;  
	String name;  
	int age;  
	StudentC(int rollno,String name,int age)
	{  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	public int compareTo(StudentC st)
	{  
	if(age==st.age)  
	return 0;  
	else if(age>st.age)  
	return 1;  
	else  
	return -1;  
	}  
}  
public class TestComparable 
{
     public static void main(String args[])
	 {  
	     ArrayList<StudentC> al=new ArrayList<StudentC>();  
	     al.add(new StudentC(101,"Vijay",23));  
	     al.add(new StudentC(106,"Ajay",27));  
	     al.add(new StudentC(105,"Jai",21));  
	  
	      Collections.sort(al);  
	      for(StudentC st:al)
	      {  
	         System.out.println(st.rollno+" "+st.name+" "+st.age);  
	      }  
      }  
}  

