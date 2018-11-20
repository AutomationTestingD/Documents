package jAVASTRINGS;

public class StartsWithAndEndsWithMethods {
	
	  public static void main(String[] args) {  
		  
		  System.out.println("\n"+"********** startsWithMethod **********");
	        String str = "java string split method by javatpoint";  
	        System.out.println(str.startsWith("J")); // True  
	        System.out.println(str.startsWith("a")); // False  
	        System.out.println(str.startsWith("t",6)); // True  
	        System.out.println(str.startsWith("java string"));  //True
	        
	        
	  	  System.out.println("\n"+"********** endsWithMethod **********");	        
	        String str2 = "Welcome to Javatpoint.com";  
	        System.out.println(str2.endsWith("point"));  
	        
	        if(str2.endsWith(".com")) 
	          { 
	        	System.out.println("String ends with .com");  
	          }
	        else 
	        	System.out.println("It does not end with .com");  
	    }  
	 
	        
	        
	        
	    }  
	  


