package Assignment7;
import java.util.Scanner;
public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1,rsize;
		System.out.println("enter row number");
		Scanner scanner =new Scanner(System.in);
		rsize=scanner.nextInt();
		for(int r =1 ; r<=rsize ; r++)
		{
			for(int space=1; space<=rsize-r;space++)
				System.out.print(" ");
			
			for(int c=1 ; c<=r ; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	


	}

}
