package com.CollectionFramwork;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		 map.put("Mango",101);  //Put elements in Map  
		 map.put("Apple",102);    
		 map.put("Banana",103);   
		 map.put("Grapes",104);
		 
		 
		  System.out.println("Size of map is:- "+ map.size());
		  System.out.println(map);
		  if (map.containsKey("Banana"))
		  {
			  
	            int b = map.get("Banana");
	            System.out.println("value for key " + "Banana is:- " + b);
	        }
		 
		  System.out.println("Iterate HashMap Value and keys....");  
		   for(Map.Entry m : map.entrySet())
		   {    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		

	}

}
