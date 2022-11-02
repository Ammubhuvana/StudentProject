import java.util.Scanner;
public class FirstNnameLastNamewithFuncEx {
	public static void myName(String firstName,String lastName)
	{
		String name=firstName+lastName;
		System.out.println("My name is:"+name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String firstName=scanner.next();
		String lastName=scanner.next();
		myName(firstName,lastName);

	}

}
