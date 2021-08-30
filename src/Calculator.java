import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
	      double num1;
	      double num2;
	      double ans;
	      Scanner keyword = new Scanner(System.in);
	      System.out.print("Enter two numbers: ");
	      num1 = keyword.nextDouble();
	      num2 = keyword.nextDouble();
	      System.out.print("\nEnter an operator (+, -, *, /): ");
	      char ch = keyword.next().charAt(0);
	      switch(ch) {
	         case '+': ans = num1 + num2;
	            break;
	         case '-': ans = num1 - num2;
	            break;
	         case '*': ans = num1 * num2;
	            break;
	         case '/': ans = num1 / num2;
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      System.out.print("\nThe result is given as follows:\n");
	      System.out.printf(num1 + " " + ch + " " + num2 + " = " + ans);
	   }
	}
