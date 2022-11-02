package Collection;

import java.util.ArrayList;

public class ArrayListInteger {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>li=new ArrayList<Integer>();
		
		li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
  
        
        System.out.println("List: " + li);
        if(li.isEmpty())
        {
        	for(int i=0;i<li.size();i++)
        	{
        		System.out.println(li.get(i));
        	}
        }
        int element = li.get(2);
        System.out.println("the element at index 2 is "+ element);
                           
    }
	           
} 
	

	


