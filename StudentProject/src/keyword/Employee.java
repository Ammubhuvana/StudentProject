package keyword;

public class Employee {
	int empid;
	int salary;
	static String ceo;
	void show()
	{
	System.out.println(empid+":"+salary+":"+ceo);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.empid=456;
		e1.salary=15000;
		Employee e2=new Employee();
		e2.empid=677;
		e2.salary=20000;
		Employee.ceo="Noble";
		e1.show();
		e2.show();
		
	}			

	}


