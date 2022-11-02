package Exception;

public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null; 
		 
        
        try
        { 
             if (str.equals("NullPointer")) 
                System.out.print("Same"); 
            else
                System.out.print("Not Same"); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.print("NullPointerException Caught"); 
        } 
    } 

	}


