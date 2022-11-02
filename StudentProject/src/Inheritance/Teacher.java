package Inheritance;
import java.util.Scanner;
public class Teacher {
	 
	public static final char[] mainSubject = null;
	String designation = "Teacher";
    String collegeName = "Beginnersbook";
	 void does(){
		System.out.println("Teaching");
	   }
	   public class PhysicsTeacher extends Teacher{
		   String mainSubject = "Physics";
	   }
	  

}
