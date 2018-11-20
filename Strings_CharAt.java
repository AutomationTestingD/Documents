//The java string charAt() method returns a char value at the given index number. 
// It returns StringIndexOutOfBoundsException if given index number is greater than or equal to this string length or a negative number.

package jAVASTRINGS;
import java.util.Scanner;
public class CharAt {
	  
		public static void main(String args[]){  
			
		String name="DilEep Kumar SamudralA";  
				
		System.out.println("\n"+"***** Printing selected and last characters *****");
		System.out.println("\n"+"4th character of String -> " + name.charAt(3)); 
		System.out.println("Last character of String -> " +name.charAt(name.length()-1));
				
		System.out.println("\n"+"***** Printing odd index characters *****");
		for (int i=0; i<name.length()-1; i++) {
			if (i%2 != 0) {
				System.out.println("Char at "+"place: "+i+" is "+name.charAt(i));
			}}		
			
		System.out.println("\n"+"***** Frequency of a Character *****");	
		int count = 0;
		Scanner sc = new Scanner(System.in); 	
		System.out.println("Enter a character to know the frequency in string 'DilEep Kumar SamudralA':");
        char c = sc.next().charAt(0); 
        		for (int i=0; i<name.length(); i++) {
			if(name.charAt(i)== c) {
				count++;
				}}
		      System.out.println(count);
			
		//char ch2=name.charAt(10);      //returns the char value at the 10th index  
		//System.out.println(ch2);  
		      
		}
		
		}

