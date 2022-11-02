package Exception;

public class StringIndexBoundOfexceptionf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "My String";
	        try {
	            System.out.println(str.charAt(9));
	        }
	        catch(StringIndexOutOfBoundsException e) 
	        {
	            System.out.println("String index out of bounds. String length: " + str.length());
	        }
	    }

	}


