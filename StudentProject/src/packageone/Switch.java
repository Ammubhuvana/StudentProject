package packageone;

import java.util.Scanner;

public class Switch {
	public static void main(String[]args)
	{
		System.out.println("1:addition");
		System.out.println("1:substraction");
		System.out.println("1:multiplication");
		System.out.println("1:divtion");
		
		System.out.println("enter the option you want to go for it");
		Scanner scanner=new Scanner(System.in);
		int option=scanner.nextInt();
		char chvalue=scanner.next().charAt(0);
		switch(option)
		{
		case 1:
			System.out.println("addition:"+(100+200));
			break;
		case 2:
			System.out.println("substraction:"+(100-200));
			break;
		case 3:
			System.out.println("multiplication:"+(100*200));
			break;
		case 4:
			System.out.println("division:"+(100/200));
			break;
			
		}
	}
}
