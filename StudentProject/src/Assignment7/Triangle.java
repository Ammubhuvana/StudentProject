package Assignment7;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,space=1;
		System.out.println("enter the number of rows");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
        space=n-1;
        for(j=1;j<=n;j++)
        {
        	for (i=1;i<=space;i++)
        	{
        		System.out.print(" ");
        	}
        	space--;
        	for(i=1;i<=2*j-1;i++)
        	{
        		System.out.print("*");
        	}
        	System.out.println("");
        }
	}

}
