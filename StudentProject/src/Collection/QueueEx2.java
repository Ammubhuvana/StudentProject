package Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
public class QueueEx2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<String>stringLengthComparator=new Comparator<String>();

    public int compare(String s1,String s2)
        {
        	return s1.length()-s2.length();
        }
	}
	
	PriorityQueue<String>namepriorityQueue=new PriorityQueue<>(stringLengthComparator);
    namepriorityqueue.add("Gay");
    namepriorityqueue.add("Ammu");
    namepriorityqueue.add("deeps");
    namepriorityqueue.add("Harini");
    namepriorityqueue.add("Arshiya");
    namepriorityqueue.add("ju");
    
    while(!namepriorityqueue.Isempty())
    {
    	System.out.println(namepriorityQueue.remove());
    }
}
}
