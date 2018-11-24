package zJavaAdvanced;

class Java_TestReturnArray{  
	//creating method which returns an array  
	static int[] get(){  
	int a[]= new int[]{10,30,50,90,60};
	return a;  
	}  
	  
	public static void main(String args[]){  
	//calling method which returns an array  
	int arr[]=get();  
	//printing the values of an array  
	for(int i=0;i<arr.length;i++)  
	System.out.println(arr[i]);  
	}}  