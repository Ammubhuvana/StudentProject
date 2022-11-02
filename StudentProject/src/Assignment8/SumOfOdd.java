package Assignment8;
import java.util.Scanner;
public class SumOfOdd {
    private static Scanner scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number,i,sumodd=0;
        scanner=new Scanner(System.in);
        System.out.println("enter a number:");
        number=scanner.nextInt();
        for(i=1;i<=number;i++)
        {
        	if(i%2!=0)
        	{
        		sumodd=sumodd+i;
        	}
        }
        System.out.println("The sum of odd numbers upto "+number+" = "+sumodd);
	}

}
