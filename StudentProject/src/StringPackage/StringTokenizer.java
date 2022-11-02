package StringPackage;
import java.util.Scanner;
import java.util.StringJoiner;

class Student
{
	//member variables
	String sname;
	int id;
	float marks;
	public Student()
	{
		sname="kaviya";
		id=100;
		marks=8.9f;
	}
	public Student(String sname,int id,float marks)
	{
		this.sname=sname;
		this.id=id;
		this.marks=marks;
	}
}
public class StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student student=new Student();//student( calls the)default constructor which is implemented by the
		 //jvm by default
		 //default constructor used to assign the default values to the member variable
		 System.out.println(student.sname);
		 System.out.println(student.id);
		 System.out.println(student.marks);
		 
		 Student student1=new Student();
		 System.out.println(student1.sname);
		 System.out.println(student1.id);
		 System.out.println(student1.marks);
		
		 Student student2=new Student("tanu",300,67.98f);
		 System.out.println(student2.sname);
		 System.out.println(student2.id);
		 System.out.println(student2.marks);
				
			

		}

        
	}


