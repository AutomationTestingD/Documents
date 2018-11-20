package jAVASTRINGS;


import java.util.HashMap;

import java.util.Iterator;



public class DuplicateStrings {			

		public static void main(String[] args) {
		
			findDuplicateWord("I am am a Java lerner and and Selenium Selenium lerner lerner lerner");

		   }

		private static void findDuplicateWord(String string) {
		
			String[] str = string.split(" ");
		
			HashMap<String, Integer> Hm = new HashMap<>();
		
			for(String tempstring : str) {
			
				 if(Hm.get(tempstring) != null) {

					Hm.put(tempstring, Hm.get(tempstring) + 1);

				    }

				else

				    Hm.put(tempstring, 1);}
							
			Iterator<String> itrstr = Hm.keySet().iterator();

			System.out.println(Hm);
		
				while (itrstr.hasNext()) {
				
					String temp = itrstr.next();
					if(Hm.get(temp) > 1) {
					System.out.println("'"+temp+"' Word is appeared "+Hm.get(temp)+ " times ");			}}
			
					
					}

	}