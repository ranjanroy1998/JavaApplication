package com.demo;

import java.util.Scanner;
public class OddNo521To229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 121; i <=number; i = i - 2)
		{
			System.out.print(i +"\t"); 
		}	
	}

}
