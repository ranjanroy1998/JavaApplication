package com.CollectionFramwork;

import java.util.ArrayList;
import java.util.Scanner;
public class Student
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name;
		int roll;
		int marks;
	
		
		public Student(String name, int roll, int marks )
		{
			this.name = name;
			this.roll= roll;
			this.marks = marks;
			
		 }
}
public class StudentArrayList 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		int roll;
		String name;
		int marks;
		
		for(int i =0; i<5; i++)
		{
			System.out.println("Enter Student roll ,name, marks " +i );
			roll=sc.nextInt();
			name =sc.next();
			marks=sc.nextInt();
			Student s1= new Student(roll,name,marks);
			list.add(s1);
			
		}
		
		System.out.println("Student Information");
		for(Student s1:list)
		{
			//Student s = list.get(j);
			
		System.out.println(s1.roll+""+s1.name+""+s1.marks);
			
		}
		
	}
}
