package Collection;
import java.util.*;
public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();  
        set.add("Anu");  
        set.add("Sugu");  
        set.add("Kalai");  
        set.add("Praveena");  
        System.out.println("An initial list of elements: "+set);  
        //Removing specific element from HashSet
        set.remove("Anu");
        
        System.out.println("After invoking remove(object) method: "+set); 
        
        HashSet<String> set1=new HashSet<String>();
        
        set1.add("Sugu");
        set1.add("Ammu");  
        set.addAll(set1);  
        System.out.println("Updated List: "+set);  
        //Removing all the new elements from HashSet  
        set.removeAll(set1);  
        System.out.println("After invoking removeAll() method: "+set);  
        //Removing elements on the basis of specified condition  
        set.removeIf(str->str.contains("Sugu"));    
        System.out.println("After invoking removeIf() method: "+set);  
        //Removing all the elements available in the set  
        set.clear();  
        System.out.println("After invoking clear() method: "+set);  
}  
}  

	


