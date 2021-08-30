import java.util.Scanner;
public class VowelConstant {
	public static void main(String[] args)
	{
		System.out.println("Enter a character :");
	      Scanner keyword = new Scanner(System.in);
	      char ch = keyword.next().charAt(0);
        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }

}
