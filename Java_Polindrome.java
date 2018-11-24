package zJavaAdvanced;
import java.util.Scanner;
public class Java_Polindrome {
	
	public static void main(String Dileep[]) {
		
		System.out. println("\n"+"Please enter how many strings you want to test");
		Scanner input = new Scanner(System.in);		
		int num = input.nextInt();	
		
		for(int i=0; i<num; i++) {
			
			//Polindrome pol = new Polindrome();	
		System.out.println(polindromeCHeck());
		
		
		}
	}
		public static String polindromeCHeck() {
			
		String notPolindromeMessage = "\n"+"Entered String is not a polindrome";
		String polindromeMessage = "\n"+"Entered String is a polindrome";
			
		System.out. println("\n"+"Please enter a String to test");	
		Scanner input = new Scanner(System.in);		
		String enteredString = input.nextLine();		
		System.out. println("\n"+"You have entered the string:  "+enteredString);
		
		for (int i=0; i<enteredString.length()/2; i++) {
			
			if(enteredString.charAt(i)!=enteredString.charAt(enteredString.length()-i-1))
				
					return notPolindromeMessage;				
			     }		
			
		return polindromeMessage;
		
		}}

/*
public class Palindrome
{
    public static void main(String args[])
    {
        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}
*/