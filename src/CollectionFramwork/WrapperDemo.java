package com.CollectionFramwork;

import java.lang.*;

public class WrapperDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
		Integer j=a;
		
		System.out.println(a+" "+i+" "+j);

	}

}