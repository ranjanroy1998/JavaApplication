import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		      int year;
		      System.out.println("Enter an Year :: ");
		      Scanner keyword = new Scanner(System.in);
		      year = keyword.nextInt();

		      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		         System.out.println("This is a leap year");
		      else
		         System.out.println("THis is not a leap year");
		   }

}
