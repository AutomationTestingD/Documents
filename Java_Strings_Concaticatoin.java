package jAVASTRINGS;

public class Concaticatoin {

	public static void main(String[] args) {


		System.out.println("\n"+"***** String Concatenation by + (string concatenation) operator *****");
		    String s="Sachin"+" Tendulkar";  
		    System.out.println("\n"+s);
		
		
		    String s5=50+30+"Sachin"+40+40;  //After a string literal(""), all the '+' will be treated as string concatenation operator. starting '+' will be treated as addition(arithmetic as integers are available) operator
		    System.out.println(s5);//
		   
		System.out.println("\n"+"\n"+"*****         String Concatenation by concat() method           *****");
		
			   String s1="Sachin ";  
			   String s2="Tendulkar";  
			   String s3=s1.concat(s2);  
			   System.out.println("\n"+s3);
			   
		System.out.println("\n"+"\n"+"*****     String Concatenation by concat() method elobaration  *****");
			    String str1 = "Hello";  
		        String str2 = "Javatpoint";  
		        String str3 = "Reader";  
		        // Concatenating Space among strings  
		        String str4 = str1.concat(" ").concat(str2).concat(" ").concat(str3);  
		        System.out.println(str4);  
		        
		        String str5 = str1.concat(str2).concat(str3);  
		        System.out.println(str5);  
		        
		        String s8="java string";  
		        s8.concat("is immutable");  
		        System.out.println(s8);  
		        s8=s8.concat(" is immutable so assign it explicitly");  
		        System.out.println(s8);  


	}

}
