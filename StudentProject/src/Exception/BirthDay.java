package Exception;

import java.time.LocalDate;
import java.time.Month;

public class BirthDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int birthDate = 8;
	    Month birthMonth = Month.SEPTEMBER;

	   
	    LocalDate currentDate = LocalDate.now();
	    System.out.println("Today Date: " + currentDate);

	    
	    int date = currentDate.getDayOfMonth();
	    Month month = currentDate.getMonth();

	    if(date == birthDate && month == birthMonth) {
	      System.err.println("HAPPY BIRTHDAY TO ONE OF THE MOST SPECIAL PEOPLE IN MY LIFE.");
	      System.err.println("I AM SO GRATEFUL FOR YOUR FRIENDSHIP");
	      System.err.println("WE HAVE MADE WONDERFUL MEMORIES TOGETHER");
	      System.err.println("I HOPE ALL YOUR WISHES COME TRUE");
	    }
	    else {
	        System.out.println("Today is not your birthday.");
	      }
	}   
}

	


