package Collection;

import java.util.Queue;
import java.util.LinkedList;
public class QueueEx {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Queue<Integer> q1 =  new LinkedList<Integer>();
	        //Add elements to the Queue
	        q1.add(10);
	        q1.add(20);
	        q1.add(30);
	        q1.add(40);
	        q1.add(50);
	        System.out.println("Elements in Queue:"+q1);
	        
	        System.out.println("Element removed from the queue: "+q1.remove());
	        
	        System.out.println("Head of the queue: "+q1.element());
	        
	        System.out.println("Poll():Returned Head of the queue: "+q1.poll());
	     
	        System.out.println("peek():Head of the queue: "+q1.peek());
	        
	        System.out.println("Final Queue:"+q1);
	    }
	}



	


