package Collection;

import java.util.ArrayList;
import java.util.List;

class Employee{
    public int id;
    public String name;
    public String city;
    public static int count = 0;
 
    
    public Employee(){}
 
    
    public Employee(int id, String name,String city)
    {
        super();
        this.id = id;
        this.name = name;
        this.city=city;
        count++;
    }
 
    public int getId() {
    return id;
    }
 
    public String getName() {
    return name;
    }
 
    public String getAddress() {
    return city;
    }
}
public class ArrayListEx {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		 
	     list.add(new Employee(1, "Ammu","Delhi"));
	     list.add(new Employee(2, "Bhuvana","Mumbai"));
	     list.add(new Employee(3, "Rekha","Chennai"));
	     list.add(new Employee(4, "Sugu","Selam"));
	 
	        for (Employee s : list) 
	        {
	            System.out.print("ID, Name and City of the employee are : ");
	            System.out.println(s.getId()+" "+s.getName()+" " +s.getAddress());
	        }
	    }

	}


