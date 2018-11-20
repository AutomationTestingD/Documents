package jAVASTRINGS;

public class Palindrome {	
		
           private static boolean NoReverse(String str) {
        	
        	   for(int i=0; i<str.length()/2; i++) {
        		
        		if (str.charAt(i) != str.charAt(str.length()-i-1)) {        			
        			return false;        			        			        			
        		}}        	
			    return true;}
        	
			
			private static boolean isPalindrome(String str) {
		        if (str == null)
		            return false;
		        StringBuilder strBuilder = new StringBuilder(str);
		        strBuilder.reverse();
		        return strBuilder.toString().equals(str);}
			
            
		public static void main (String[] args) {
		
		System.out.println("Without Using reverse() method: "+Palindrome.NoReverse("NitiN"));		
		System.out.println("Using reverse() method: "+Palindrome.isPalindrome("NitiN"));
		
	}

}
