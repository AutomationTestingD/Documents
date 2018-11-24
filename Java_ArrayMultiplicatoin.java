package zJavaAdvanced;
import java.util.Arrays;
public class Java_ArrayMultiplicatoin {
	public static void main(String[] args) {		
		
		int[][] arrayA = {{1,1,1},{1,1,1},{1,1,1}};
		int[][] arrayB = {{1,1,1},{1,1,1},{1,1,1}};
		
		System.out.println("ArrayA = :"+"\n");
		for (int i=0; i<arrayA.length; i++) {		
			    
	        	System.out.println(Arrays.toString(arrayA[i]));}
		
		System.out.print("\n"+"ArrayB = :"+"\n");
	        	
	        	for (int i=0; i<arrayA.length; i++) {
	        	
	        	System.out.println(Arrays.toString(arrayB[i]));}
				
	        	System.out.println("\n"+"Multiplicatoin of Array A and Array B:"+"\n");
		
	
	        	int arrayC[][]=new int[3][3];

	for(int i=0;i<arrayA.length;i++) {
		
		for(int j=0;j<arrayA.length;j++) {
			
			arrayC[i][j] =0;
	    
			for(int k=0;k<arrayA.length;k++) {

				arrayC[i][j] += arrayA[i][k]*arrayB[k][j];}
				System.out.print(arrayC[i][j]+"  ");
					}
		System.out.println();
		}
	}}
	
	








