import java.util.Scanner;
public class Substraction {
	public static void sub(int num1,int num2,int num3)
	{
		
		int result=num1-num2-num3;
		System.out.println("The result is:"+result);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num1,num2,num3");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
		
		sub(num1,num2,num3);
		

	}

}
