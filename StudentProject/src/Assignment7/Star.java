package Assignment7;
import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1,rsize;
		System.out.println("enter row number");
		Scanner scanner =new Scanner(System.in);
		rsize=scanner.nextInt();
		for(int r =1 ; r<=rsize ; r++)
		{
			
				System.out.print(" ");
			
			for(int c=1 ; c<=r ; c++)//1<=2
			{
				System.out.print("*");
			}
			System.out.println();
		}	

	}

	}


