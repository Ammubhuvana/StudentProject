package Collection;

import java.util.TreeSet;


public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>ts=new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		System.out.println(ts.add("Apple"));
		
		ts.add("Banana");
		ts.add("Grapes");
		ts.add("Strawberry");
		System.out.println("ts TreeSet:"+ts);
		System.out.println("Number of elements in the TreeSet:"+ts.size());
        String name="Orange";
        if(ts.contains(name))
        {
        	System.out.println("TreeSet contains the element:"+name);
        }
        else
        {
        	System.out.println("TreeSet contains the element:"+name);
        }
        System.out.println("First element:"+ts.first());
        System.out.println("last element:"+ts.last());
        
        name="Banana";
        
        System.out.println("Element is greater than " +name+ "+" +ts.higher(name));
        System.out.println("Element is lower than " +name+ "+" +ts.lower(name));

}
}
