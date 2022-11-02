package packageone;
import java.util.Scanner;

public class CentiGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperature;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the temperature");
		temperature=scanner.nextInt();
		if(temperature<=0)
		{
			System.out.println("very cold");
			
		}
		if(0<temperature&&temperature<=10)
		{
			System.out.println("cold");
			
		}
		if(10<temperature&&temperature<=20)
		
		{
			System.out.println("cool out");
			
		}
		if(20<temperature&&temperature<=30)
		{
		
		System.out.println("warm");
		}
		if(temperature>30)
		{
		System.out.println("hot");
		}
		

	}

}
