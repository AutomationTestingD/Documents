package jAVASTRINGS;

import java.util.ArrayList;

public class Equals {
	
	  public static void main(String[] args) {  
	        String str1 = "Mukesh";  
	        
	        ArrayList<String> list = new ArrayList<>();  
	        list.add("Ravi");   
	        list.add("Mukesh");  
	        list.add("Ramesh");  
	        list.add("Ajay");  
	        
	        for (String i : list) {  
	            if (i.equals(str1))  //String i from the list is equal to 'Mukesh'
	            {  
	                System.out.println("Mukesh is present"); 	                                
	               
	            }  
	        }  
	    }  
	}  


