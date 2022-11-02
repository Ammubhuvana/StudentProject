package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingEx {
	int fact=1;
	public void calfact(int num)
	{
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.err.println("Factorial of given number is"+fact);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ExceptionHandlingEx ex=new ExceptionHandlingEx();
		Scanner sc=new Scanner(System.in);
        System.out.println("please enter a number ");
        int n=sc.nextInt();
        ex.calfact(5);
		}
		catch(InputMismatchException e)
		{
        System.out.println("Incorrect input|| please enter numeric value between 1 to 100");
	}

}
}
