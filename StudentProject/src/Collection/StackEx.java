package Collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		  
       
        stack.push(10);
        stack.push(16);
        stack.push(50);
        stack.push(30);
        stack.push(4);
  
       
        System.out.println("Initial Stack: " + stack);
        
        System.out.println("Popped element: "+ stack.pop());
       
                          
        System.out.println("Stack after pop operation "+ stack);
                           
    }

	}


