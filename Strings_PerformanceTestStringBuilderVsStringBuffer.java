package jAVASTRINGS;

public class PerformanceTestStringBuilderVsStringBuffer {
	
	public static void main(String[] args){ 
		
			        long startTime = System.currentTimeMillis();			        	        
			  		String t = "Java";  
			        for (int i=0; i<80000; i++){  
			        t = t + "Tpoint";   }
			        System.out.println("Time taken by String: "+(System.currentTimeMillis()-startTime)+"ms");
			        
			        
			        startTime = System.currentTimeMillis(); 
			        StringBuffer sb = new StringBuffer("Java");  
			        for (int i=0; i<80000; i++){  
			        sb.append("Tpoint");  }
			        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
			        
			        			        
			        
			        startTime = System.currentTimeMillis();  
			        StringBuilder sb2 = new StringBuilder("Java");  
			        for (int i=0; i<80000; i++){  
			        sb2.append("Tpoint"); }
			        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms"); 
			       
			        
			        
			   

		
	}  
			}  



