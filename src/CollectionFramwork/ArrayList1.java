package com.CollectionFramwork;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;


public class ArrayList1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       ArrayList<String> al = new ArrayList<String>();
       
          // try 
         //{
    	   Scanner scan =new Scanner(System.in);
    	   String myString = scan.nextLine(); 
    	  
    	   System.out.println("Enter a Element youwant to add :");
    	   int totalElement= scan.nextInt();
    	   
    	   for(int i=0; i<totalElement; i++)
    	   {
    		   System.out.println("Enter Values at Position"+myString);
    		   myString = scan.next();
    		   if(myString.equals("sita"));
    		       throw new InvalidName("you entered invaliid name"+myString);
   		   al.add(myString);
    		   
    	   }
           }    
    	  
    	
	    Iterator itr = al.iterator();
	   // int count = 1;
	    while(itr.hasNext())
	    {
	    	System.out.println(" "+ itr.next());
	    	
	    }
	    
       
	}
	

}
