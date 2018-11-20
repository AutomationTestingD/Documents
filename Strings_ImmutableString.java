//In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
//Once string object is created its data or state can't be changed but a new string object is created.

package jAVASTRINGS;

public class ImmutableString {
	
	public static void main(String[] args) {
		
		String s = "Sachin";
		s.concat("Tendulkar");
		System.out.println(s);
		
		
		String s1 = "Sachin";
		s1 = s1.concat(" Tendulkar");
		System.out.println(s1);
	}

}
