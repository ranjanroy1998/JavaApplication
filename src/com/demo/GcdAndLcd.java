package com.demo;

import java.util.Scanner;

public class GcdAndLcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, gcd = 0, lcm, count = 1, small;    
	    Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter Two Number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		  
	    small = (num1 < num2) ? num1 : num2;  
	  
	    while(count <= small)  
	    {  
	        if(num1 % count == 0 && num2 % count == 0)  
	        {  
	            gcd = count;  
	        }  
	        count++;  
	    }
	    lcm = ( num1 * num2 ) / gcd;    
	    System.out.println("gcd:"+ gcd);
	    System.out.println("lcm:"+lcm); 
	}
}
