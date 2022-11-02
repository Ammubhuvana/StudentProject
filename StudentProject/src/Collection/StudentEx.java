package Collection;

import java.util.ArrayList;
import java.util.Scanner;

import keyword.Student;

class TestingClass{
	       public String    name    = "";
	       public String    address = "";

	       public void Student(String name2, String address2) {

	           this.name = name2;
	           this.address = address2;
	       }

	     @Override
	     public String toString() {

	         return "Student [name=" + this.name + ", address=" + this.address + "]";
	        }

	     }
public class StudentEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      

		        Scanner input = new Scanner(System.in);
		        System.out.println("Please enter the number of students detail : ");
		        int numberOfInputs = input.nextInt();

		        ArrayList<Student> StudentList = new ArrayList<Student>();


		        for( int i=0;  i < numberOfInputs ; i++){
		            System.out.println("Please enter Name : ");
		            String name = input.next();
		            System.out.println("Please enter Address : ");
		            String address = input.next();

		            Student std = new Student(name, address);
		            StudentList.add(std);
		        }

		        for(Student std : StudentList){
		            System.out.println(std.toString());
		        }
		     }
		    

	}


