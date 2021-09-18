package com.CollectionFramwork;

import java.util.LinkedHashSet;

public class LinkHashSetDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedHashSet<String> l = new LinkedHashSet();
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("Z");
		l.add(null);
		//l.add(10);
        System.out.println(l.add("Z"));
        System.out.println(l);

	}
}
