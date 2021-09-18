package com.CollectionFramwork;

import java.util.*;
public class IteratorDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5; i++)
		{
			System.out.println("Enter a Element");
			String st = sc.next();
			list.add(st);
		}
		
		System.out.println("Dispaly Element using Iterator interface:");
		Iterator itr =list.iterator();
		//int count = 5;
	    while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	    System.out.println("Dispaly Element using For each loop:");
		for(String str:list)
		{
			System.out.println(str);
		}
		
		System.out.println("Dispaly Element using for loop:");
		for(int j=0; j<list.size();j++)
		{
			System.out.println(list.get(j));
		}
		
		System.out.println("Dispaly Element using ListIterator interface:");
		ListIterator<String> li = list.listIterator(list.size());		
		
		
		while(li.hasPrevious())
		{
			String st=li.previous();
			System.out.println(st);			
		}
		
        
	}

}
