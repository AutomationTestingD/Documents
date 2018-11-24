package TestPackage;
import java.util.Scanner;
public class StrinLeanth {
	
	
	
	public static void main(String args[]) {		
		System.out.println("Enter the String to get its length");   
		ind();
	}
		public static void ind() {			
			Scanner in = new Scanner(System.in);
			String enteredString = in.nextLine();
			StringBuffer sb =new StringBuffer(enteredString);
			sb = sb.append("*");
			int count =0;
		    while(sb.indexOf("*")>=0) {
			int a = sb.indexOf("*");
			sb.replace(a, a+1, "0");
			count =a;	
		}	
		
		System.out.println("String length without length method: " + (count+1));
		System.out.println("String length with length method: "+sb.length());
				
		}
	}

