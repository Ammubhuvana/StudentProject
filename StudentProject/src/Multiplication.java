import java.util.Scanner;

public class Multiplication {
	public static void multiplyNumbers()
	{
		int number1,number2,number3,res;
		Scanner scanner=new Scanner(System.in);
		number1=scanner.nextInt();
		number2=scanner.nextInt();
		number3=scanner.nextInt();
		
		
		res=number1*number2*number3;
		System.out.println("The result is"+res);
	}

	public static void main(String[] args) {
		System.out.println("enter the number1, number2 and number3");
		multiplyNumbers();

	}

}
