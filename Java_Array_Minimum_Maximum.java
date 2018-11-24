package zJavaAdvanced;
import java.util.Arrays;

public class Java_Array_Minimum_Maximum {
	
		public static void min(int[] a) {		
		int min = a[0];		
		for(int i=0; i<a.length; i++) {			
			if(min>a[i]) {  //for maximum numbers 	if(min<a[i])			
				min =a[i];			
			}}	
			System.out.println("Minimum number of "+Arrays.toString(a)+" Array is "+"\""+min+"\"");
			
		
	}	
	
	public static void main(String[] dileep) {		
		int a[] = {455, 125,84,58,500};		
		min(a);
		
	}
	
}
