package Polymorphism;

 class Addition {
	
	 void sum(int a, int b) 
	{ 
	int c = a+b; 
	System.out.println("addition of two numbers:"+c);
	} 
	void sum(int a, int b, int e) 
	{ 
	int d = a+b+e; 
	System.out.println("addition of three numbers:"+d);
	} 
 }
public class overloading{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj = new Addition(); 
		obj.sum ( 30,90); 
		obj.sum(45, 80, 22); 

	}

}
