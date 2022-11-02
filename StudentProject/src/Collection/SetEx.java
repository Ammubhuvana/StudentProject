package Collection;


import java.util.HashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> cities_Set = new HashSet<String>(); 
		  
        cities_Set.add("Bangaluru"); 
        cities_Set.add("Pune"); 
        cities_Set.add("Hyderabad"); 
        cities_Set.add("Kolkata"); 
           
        // Print the set contents
        System.out.println("HashSet: " + cities_Set); 
  
        System.out.println("\nSet contents using forEach loop:"); 
        // print the set contents using forEach loop
        for(String val : cities_Set)
        {
            System.out.print(val + " ");
        }
	}
}
	


