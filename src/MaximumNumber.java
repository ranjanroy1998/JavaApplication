import java.util.Scanner;
public class MaximumNumber {
	public static void main(String args[])
	{
        Scanner keyword = new Scanner(System.in);
        System.out.println("Enter the first no:");
        int a = keyword.nextInt();
        System.out.println("Enter the second no:");
        int b = keyword.nextInt();
        System.out.println("Enter the third no:");
        int c = keyword.nextInt();
 
 if(a>b && a>c)
 { 
         System.out.println(a+" is the maximum no");
 
 }
 else
 {
 if(b>a && b>c)
 { 
         System.out.println(b+" is the maximum no");
 }
 else
 { 
         	System.out.println(c+" is the maximum no");
 }
 }
   }

}
