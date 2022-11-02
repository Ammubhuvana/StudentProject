package packageone;
import java.util.Scanner;
public class DisplayDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the number of day");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		switch(num)
		{
		case 1:
		{
			System.out.println("Sunday");
			break;
		}
		case 2:
		{
			System.out.println("Monday");
			break;
		}
		case 3:
		{
			System.out.println("Tuesday");
			break;
		}
		case 4:
		{
			System.out.println("Wednesday");
			break;
		}
		case 5:
		{
			System.out.println("Thursday");
			break;
		}
		case 6:
		{
			System.out.println("Friday");
			break;
		}
		default:
		{
			System.out.println("please check the number");
		
		}
		}

	}

}
