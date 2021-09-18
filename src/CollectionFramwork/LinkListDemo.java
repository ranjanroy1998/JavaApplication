package com.CollectionFramwork;

import java.util.*;
public class LinkListDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
			  LinkedList<String> al=new LinkedList<String>();  
			  al.add("Bat");  
			  al.add("Ball");  
			  al.add("Ground");  
			  al.add("Player");  
			  
			  Iterator<String> itr=al.iterator();  
			  while(itr.hasNext())
			  {  
			   System.out.println(itr.next());  
			  }    

	}

}
