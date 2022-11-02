package packageone;
import java.util.Scanner;
public class Terminate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    int sum = 0;
	    char op;
	    do{
	      System.out.println("Enter two numbers");
	      int num1= scanner.nextInt();
	      int num2 = scanner.nextInt();
	      sum = sum+num1+num2;
	      System.out.println("Do you wish to perform another operation, Y/N");
	      op =scanner.next().charAt(0);
	    }while(op =='Y'||op=='y');
	    System.out.println("sum "+sum);
	  }
	
	
	}


