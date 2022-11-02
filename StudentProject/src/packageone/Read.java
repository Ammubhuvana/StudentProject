package packageone;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll_Number=784;
		String Name="James",division;
		int physics=70,chemistry=80,computer_Application=90,total;
		float average,percentage;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("roll_Number:"+roll_Number);
		System.out.println("Name of Student :"+Name );
		System.out.println("Marks in physics:"+physics);
		System.out.println("Marks in chemistry:"+chemistry);
	    System.out.println("Marks in computer Application:"+computer_Application);
	
		total=physics+chemistry+computer_Application;
		System.out.println("Total of marks="+total);
		
		percentage=total/3;
		System.out.println("percentage="+percentage);
	
		if (percentage>=70)
		{
			System.out.println("division:First");
		}
		    else
			if (percentage>=65)
			{
			    System.out.println("division:Second");
			}
			else
			{
				System.out.println("division:third");
			}
		
		}

}
