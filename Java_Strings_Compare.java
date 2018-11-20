package jAVASTRINGS;

public class Compare {

	public static void main(String[] args) {
		
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Sourav";
		String s5 = "SACHIN"; 
		String s6 = "Ratan";  
		
		System.out.println("\n"+"********** String compare by equals() method   **********");
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4)+"\n");//false	
		   
		   System.out.println("Ignore CaseSensitivity"+"\n");		   
		   System.out.println(s1.equals(s5));//false  as s5 is in uppercase letters
		   System.out.println(s1.equalsIgnoreCase(s5));//true as ignores uppercase letters
		   
		   
	    System.out.println("\n"+"********** String compare by   ==     operator  **********");	    
	       System.out.println(s1==s2);//true (because both refer to same instance)  
	       System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
	       
		
	    System.out.println("\n"+"********** String compare by compareTo() method **********");
	       System.out.println(s1.compareTo(s2));//0  
	       System.out.println(s1.compareTo(s6));//1(because s1>s3)  
	       System.out.println(s6.compareTo(s1));//-1(because s3 < s1 )  

	}

}
