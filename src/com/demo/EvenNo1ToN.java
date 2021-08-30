package com.demo;
import java.util.Scanner;
public class EvenNo1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum = 0;
		System.out.print("Enter no:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=2;i<=n;i+=2)
		{
			sum+=i;
		}
		System.out.print(sum);
	}

}
