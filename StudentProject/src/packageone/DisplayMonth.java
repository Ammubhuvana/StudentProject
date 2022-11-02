package packageone;
import java.util.Scanner;

public class DisplayMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int daysinMonth=0;
		String monthName="Invalid";
		
		System.out.println("Enter the month number:");
		int month=scanner.nextInt();
		if(month==1)
		{
			monthName="January";
			daysinMonth=31;
        }
		else if(month==3) {
			monthName="March";
			daysinMonth=31;
		}
		else if(month==4) {
			monthName="April";
			daysinMonth=31;
		}
		else if(month==5) {
			monthName="May";
			daysinMonth=31;
		}
		else if(month==6) {
			monthName="June";
			daysinMonth=31;
		}
		else if(month==7) {
			monthName="July";
			daysinMonth=31;
		}
		else if(month==8) {
			monthName="August";
			daysinMonth=31;
		}
		else if(month==9) {
			monthName="Septemberh";
			daysinMonth=31;
		}
		else if(month==10) {
			monthName="October";
			daysinMonth=31;
		}
		else if(month==11) {
			monthName="November";
			daysinMonth=31;
		}
		else if(month==12) {
			monthName="Decemberr";
			daysinMonth=31;
		}
		System.out.println(monthName+" "+daysinMonth);
	}
}
