package com.CollectionFramwork;

import java.util.*;
public class HashSetDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashSet h= new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		h.add(10);
		h.add(1999);
		h.clone();
		h.size();
		h.add("A");
		h.remove(10);
		h.add(10);
		h.add("K");
		h.remove("L");
		h.contains("L");
		System.out.println(h.add("N"));
		System.out.println(h);
		//System.out.println(map);

		
		
		

	}

}