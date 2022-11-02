package Assignment8;
import java.util.Scanner;
public class SumOfCubeSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a[]=new int[20];
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=scanner.nextInt();
		}
		System.out.println(summationpattern(a));

	}
	public static int summationpattern(int[] a)
	{ 
		int n1=0,n2=0;
		for(int i=0;i<a.length;i++)
			if(a[i]%2==0)
				n1+=(a[i]*a[i]);
			else
				n2+=(a[i]*a[i]*a[i]);
		return n1+n2;
		
	}

}
