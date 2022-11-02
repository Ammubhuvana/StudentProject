package packageone;
import java.util.Scanner;
public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer;
		int count = 2;
		boolean prime = true;

        Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a postive number(-1 to end): ");
		integer = scanner.nextInt();
		System.out.println();


		while (integer != -1)
		{
		while(count <= Math.sqrt(integer))
		{
		if (integer % count == 0)
		{
		prime = false;
		break;
		}
		count++;
        }
       if (prime == false)
		{
          System.out.println( integer + " is  a prime number");
		  System.out.print("The last number that divides into " + count);
		}
		else

		System.out.println( integer + " is not a prime number");
		System.out.println();


		System.out.print("Enter a postive number(-1 to end): ");
		integer =scanner.nextInt();
		System.out.println();
		}

	}

}
