package Collection;

import java.util.Vector;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v1 = new Vector<>(3);  
        v1.add("W");  
        v1.add("X");  
        v1.add("Y");          
        
        System.out.println("Elements of Vector are: "+v1);            
        System.out.println("Current capacity of Vector: "+v1.capacity());  
        
        v1.add("Z");  
        
        System.out.println("Elements after addition: "+v1);           
        System.out.println("Current capacity of Vector after modification: "+v1.capacity());  
          }  

	}


