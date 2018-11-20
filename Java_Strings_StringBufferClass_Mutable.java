package jAVASTRINGS;

public class StringBufferClass_Mutable {

	public static void main(String[] args) {
		
		
		System.out.println("\n"+"***** StringBuffer append() method *****");
		//The append() method concatenates the given argument with this string.
				StringBuffer sb=new StringBuffer("Hello ");  
				sb.append("Java"); 
				System.out.println(sb); 
				  
		System.out.println("\n"+"***** StringBuffer insert() method *****");
		//The insert() method inserts the given string with this string at the given position.
			StringBuffer sb1=new StringBuffer("Hello ");  
			sb1.insert(1," Java ");
			System.out.println(sb1); 

				
		System.out.println("\n"+"***** StringBuffer replace() method *****");
		//The replace() method replaces the given string from the specified beginIndex and endIndex.

			
				StringBuffer sb2=new StringBuffer("Hello");  
				sb2.replace(1,3,"Java");  
				System.out.println(sb2);
		System.out.println("\n"+"***** StringBuffer delete() method *****");
		//The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.
		
			StringBuffer sb3=new StringBuffer("Hello");  
			sb3.delete(1,3);  
			System.out.println(sb3);  
			
		System.out.println("\n"+"***** StringBuffer reverse() method *****");
		//The reverse() method of StringBuilder class reverses the current string.
			StringBuffer sb4=new StringBuffer("Hello");  
			sb4.reverse();  
			System.out.println(sb4);//prints olleH  

		System.out.println("\n"+"***** StringBuffer capacity() method *****");
		//The capacity() method of StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34. 
		
			StringBuffer sb5=new StringBuffer();  
			System.out.println(sb5.capacity());//default 16  
			sb5.append("Hello");  
			System.out.println(sb5.capacity());//now 16  
			sb5.append("java is my favourite language");  
			System.out.println(sb5.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  

		
		System.out.println("\n"+"***** StringBuffer ensureCapacity() method *****");
		//The ensureCapacity() method of StringBuffer class ensures that the given capacity is the minimum to the current capacity. If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34. 
		
			StringBuffer sb6=new StringBuffer();  
			System.out.println(sb6.capacity());//default 16  
			sb6.append("Hello");  
			System.out.println(sb6.capacity());//now 16  
			sb6.append("java is my favourite language");  
			System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
			sb6.ensureCapacity(10);//now no change  
			System.out.println(sb6.capacity());//now 34  
			sb6.ensureCapacity(50);//now (34*2)+2  
			System.out.println(sb6.capacity());//now 70  

		
			}

}
