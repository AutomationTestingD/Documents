package TestPackage;

public class StarSchema {
	public static void main(String[] args) {star1(); star2();}	
	public static void star1() {		
		for(int i=10; i>=0; i--) {	
			for(int n=0; n<5;n++) {
			for (int j=0; j<=i;j++)  {System.out.print("*");}				
			for (int j=10; j>i;j--)  {System.out.print("@"); }
			for (int k=0; k<10-i;k++){System.out.print("@"); }
			for (int l=0; l<=i;l++)  {System.out.print("*"); }}
			System.out.println(" ");}}
	public static void star2() {
		for(int i=10; i>=0; i--) {			
			for(int n=0; n<5;n++) {
			for (int j=0; j<=10-i;j++) {System.out.print("*");}
			for (int j=0; j<i;j++) 	   {System.out.print("@");}
			for (int k=0; k<i;k++)     {System.out.print("@");}
			for (int l=0; l<=10-i;l++) {System.out.print("*");}}
			System.out.println(" ");}}}