package Collection;

import java.util.Queue;
import java.util.LinkedList;
public class QueueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> waitingQueue = new LinkedList<>();

        waitingQueue.add("Ammu");
        waitingQueue.add("Angel");
        waitingQueue.add("Johnny");
        waitingQueue.add("Bhuvana");

        System.out.println("WaitingQueue : " + waitingQueue);

      
        System.out.println("is waitingQueue empty? : " + waitingQueue.isEmpty());

       
        System.out.println("Size of waitingQueue : " + waitingQueue.size());

        
        String name = "Johnny";
        if(waitingQueue.contains(name)) {
            System.out.println("WaitingQueue contains " + name);
        } else {
            System.out.println("Waiting Queue doesn't contain " + name);
        }

        
        String firstPersonInTheWaitingQueue =  waitingQueue.element();
        System.out.println("First Person in the Waiting Queue (element()) : " + firstPersonInTheWaitingQueue);

     
        firstPersonInTheWaitingQueue = waitingQueue.peek();
        System.out.println("First Person in the Waiting Queue : " + firstPersonInTheWaitingQueue);

    }
}

	


