package TestPackage;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharactersInString {
	
	public static void main(String[] args) {
		
	System.out.println("Please a String");
	Scanner sc = new Scanner(System.in);
	String  str =sc.nextLine();
	
	Map<Character, Integer> mp =new HashMap<Character, Integer>();
	char chars[] =str.toCharArray();
	
	for(char ch:chars) {
		
		if(mp.containsKey(ch)) {
			
			mp.put(ch, mp.get(ch)+1);
		}else
			mp.put(ch, 1);}
	
	//System.out.println(mp);
	
	
	
	Set<Character> st = mp.keySet();
	for(char ch2:st) {
			
		if(mp.get(ch2)>1) {
			System.out.println(ch2+"-->" + mp.get(ch2));}
		//else {System.out.println("no duplicate characters found");}
		
	}
	
	
	
	
	
	
	
	
	
	
		}
	

}