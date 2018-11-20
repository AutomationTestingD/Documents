package jAVASTRINGS;

public class Split {
	
	public static void main(String args[]){  
		
	String s1="java string split method by javatpoint";  
	
	System.out.println("\n"+" ***** Split with 0 limit ***** ");
	
	String[] Array = s1.split("\\s");	
	for(String A:Array) 	{
	System.out.println(A);	}

	System.out.println("\n"+" ***** Split with 1 limit ***** ");
	String[] Array1 = s1.split("\\s", 1);	
	for(String A:Array1) 	{
	System.out.println(A);	}
	
	System.out.println("\n"+" ***** Split with 2 limit ***** ");
	String[] Array2 = s1.split("\\s", 2);	
	for(String A:Array2) 	{
	System.out.println(A);	}
	
	System.out.println("\n"+" ***** Split with 3 limit ***** ");
	String[] Array3 = s1.split("\\s", 3);	
	for(String A:Array3) 	{
	System.out.println(A);	}
	
	System.out.println("\n"+" ***** Split with 4 limit ***** ");
	String[] Array4 = s1.split("\\s", 4);	
	for(String A:Array4) 	{
	System.out.println(A);	}
	
	
	System.out.println("\n"+" ***** Split with 5 limit ***** ");
	String[] Array5 = s1.split("\\s", 5);	
	for(String A:Array5) 	{
	System.out.println(A);	}
	
	System.out.println("\n"+" ***** Split with 6 limit ***** ");
	String[] Array6 = s1.split("\\s", 6);	
	for(String A:Array6) 	{
	System.out.println(A);	}
	
	
	
String s2="java string split method by javatpoint";  
	
	System.out.println("\n"+" ***** Split by 't'character ***** ");
	
	String[] Array7 = s2.split("t", 0);	
	for(String A:Array7) 	{
	System.out.println(A);	}
	
	

}}
