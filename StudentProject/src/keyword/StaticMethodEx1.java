package keyword;

public class StaticMethodEx1 {
	 
		 static int a = 10; 
		 static int change() 
		 { 
		   int a = 20; 
		   return a; 
		 } 
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = StaticMethodEx1.change(); 
	    System.out.println(a);
	}

}
