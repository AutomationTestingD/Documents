package zJavaAdvanced;
public class Java_InheritanceA {
	static int a =10;
	
	public static void methodA() {
		
		System.out.println("Method A");
	}
	}
	

class InheritanceB extends Java_InheritanceA{
		
	public static void main(String[] args) {
			
		methodB();
	
	}
		
		
		public static void methodB() {
			
			System.out.println("methodB");
			System.out.println(a);
			methodA();
		}
	}


