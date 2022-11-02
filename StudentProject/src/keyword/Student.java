package keyword;

public class Student {
	//instance variables of class student
	String name,id;
	int rollno;
	
	//declare parameterized constructor
	public Student(String name,String address)
	{
		this.name=name;
		this.rollno=address;
		
		
	}
	//declare method to display student details
	public void display()
	{
		System.out.println("student name is:"+name+"Roll no is:"+rollno);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("bhuvana",100);
		
		
		s1.display();
		

	}

}
