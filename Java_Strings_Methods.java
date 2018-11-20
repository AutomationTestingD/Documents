package jAVASTRINGS;

public class Methods {

	public static void main(String[] args) {
		
		
		System.out.println("\n"+"*** Java String toUpperCase() and toLowerCase() method ***"); 
		//The java string toUpperCase() method converts this string into uppercase letter and string toLowerCase() method into lowercase letter
		
		    String s="SAchin";  
		    System.out.println(s.toUpperCase());
			System.out.println(s.toLowerCase());  
			System.out.println(s); 

		System.out.println("\n"+"*** Java String trim() method ***");
		//The string trim() method eliminates white spaces before and after string.
		
			String s1="     Sachin Is  " + "A Cricketer      ";  
			System.out.println(s1);  
			System.out.println(s1.trim()); 
			
			
		System.out.println("\n"+"*** Java String startsWith() and endsWith() method ***");
 
			 String s2="Sachin";  
			 System.out.println(s2.startsWith("Sa")); 
			 System.out.println(s2.endsWith("n"));
			 
		System.out.println("\n"+"*** Java String charAt() method ***");
		//The string charAt() method returns a character at specified index
		// It returns StringIndexOutOfBoundsException if given index number is greater than or equal to this string length or a negative number.
		
			String s3="Sachin";  
			System.out.println(s3.charAt(0));//S  
			System.out.println(s3.charAt(3));//h  
			
		System.out.println("\n"+"*** Java String length() method ***");
		//The string length() method returns length of the string.
			String s4="Sachin";  
			System.out.println(s4.length());//
			
		System.out.println("\n"+"*** Java String valueOf() method ***");
		//converts given type such as int, long, float, double, boolean, char and char array into string.
		
			int a=10;  
			String s5=String.valueOf(a);  
			System.out.println(s5+10);  
			
		System.out.println("\n"+"*** Java String replace() method ***");
		//replaces all occurrence of first sequence of character with second sequence of character.
		
			String s6="Java is a programming language. Java is a platform. Java is an Island.";    
			String replaceString=s6.replace("Java",".Net");
			System.out.println(replaceString);    
			
		System.out.println("\n"+"*** Java String intern() method ***");
		//A pool of strings, initially empty, is maintained privately by the class String.
		//When the intern method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String object is returned.

			String s7=new String("Hai");  
			String s8=s7.intern();  
			System.out.println(s8);


	}

}
