package Collection;
import java.util.LinkedList;
import java.util.Queue;
public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>languages = new LinkedList<String>();
		languages.add("Java");
	    languages.add("Python");
	    languages.add("JavaScript");
	    languages.add("Dotnet");
	    System.out.println("LinkedList: " + languages);

	    
	    String str = languages.remove(1);
	    System.out.println("Removed Element: " + str);

	    System.out.println("Updated LinkedList: " + languages);
	  }


	}


