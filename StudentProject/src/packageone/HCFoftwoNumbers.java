package packageone;
import java.util.Scanner;
public class HCFoftwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 24, num2 = 30, hcf=0;

	    for (int i = 1; i <= num1 || i <= num2; i++)
	      {
	     if (num1 % i == 0 && num2 % i == 0)
	        hcf = i;
	      }

	    System.out.println("The HCF IS: "+ hcf);
	  }

	}


