package Exception;

import java.util.Scanner;

public class ExceptionHandling2 {

	private static final int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    Scanner sc=new Scanner(System.in);
		    int arr[]=new int[7];
		    System.out.println("Enter the array elements:");
		    for(int i=0;i<=7;i++)
		    {
		    	arr[i]=sc.nextInt();
		    }
		    System.out.println(" array elements:");
		    for(int i=0;i<7;i++);
		    {
		    	System.out.println(arr[i]);
		    }
		  }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Memory size exceeded");
		}
	}
}


