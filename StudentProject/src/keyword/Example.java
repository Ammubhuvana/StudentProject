package keyword;

class Example {
	 Example(){
		  this(1,2);
	      System.out.println("Default constructor");
	   }
	   
	   Example(int i, int j){
	      System.out.println("constructor with Two parameters");
	   }
	   
	   Example(int i, int j, int k){
		   this(1,"bhuvana");
	      System.out.println("constructor with Three parameters");	      
	   }
		   
	   
	   Example(int i, String name){
	      System.out.println("constructor with int and String parameter");
	   }
	  
	   public static void main(String args[]){
	      
	      Example obj = new Example();
          Example obj3 = new Example(1, 3, 13);
		
	      
	   }

	

	   }


