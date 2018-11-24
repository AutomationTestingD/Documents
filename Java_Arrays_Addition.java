package zJavaAdvanced;
import java.util.Arrays;
public class Java_Arrays_Addition {
	public static void main(String[] args) {
		
		int[][] arrayA = {{1,2,3},{4,3,2},{1,2,3}};
		int[][] arrayB = {{1,2,3},{4,3,2},{1,2,3}};
		
		System.out.println("ArrayA = :"+"\n");
		for (int i=0; i<arrayA.length; i++) {			
   	    System.out.println(Arrays.toString(arrayA[i]));}		
		
		System.out.print("\n"+"ArrayB = :"+"\n");	
		for (int i=0; i<arrayA.length; i++) {
	    System.out.println(Arrays.toString(arrayB[i]));}
		
		System.out.println("\n"+"Additoin of Array A and Array B:"+"\n");
		
	    int arrayC[][]=new int[3][3];
	    for(int i=0; i<3;i++) {	           			           		
	       for(int j=0; j<3;j++) {       			
	           arrayC[i][j] =  arrayA[i][j]+arrayB[i][j];	           		        	
	           System.out.print(arrayC[i][j]+"   ");
	           }          			
	           System.out.println(""+"\n");
	         }
	    }
   }
	    