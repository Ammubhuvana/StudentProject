import java.util.Scanner;

public class Division {
	public static void division(int num1,int num2,int num3)
	{
		float result=num1/num2/num3;
		System.out.println("The division result is ="+result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number1:");
		num1=scanner.nextInt();
		System.out.println("enter the number2:");
		num2=scanner.nextInt();
		System.out.println("enter the number3:");
		num3=scanner.nextInt();
		division(num1,num2,num3);
		
		

	}

}
