package jAVASTRINGS;

public class GetChars {


	public static void main(String[] args) {
		String str = "journaldev";
		
		//string to char array
		char[] chars = str.toCharArray();		
		System.out.println(chars[5]); // you can access all characters using index as str is array now
		
		//char at specific index
		char c = str.charAt(2);
		System.out.println(c);
		
		// string characters to char array
		char[] chars1 = new char[7];
		str.getChars(0, 7, chars1, 0);
		System.out.println(chars1);
		
	}

}



