package NewProject;
import java.util.*;
public class HomeMenu {
	public static void main(String[]arge)
	{
		try
		{
			User U=new User();
			Update Up=new Update();
			
			int choice;
			char a='n';
			Scanner scan=new Scanner(System.in);
			System.out.println("--------------------------------------------------");
			System.out.println("--------------------Welcome-----------------------");
			System.out.println("----------------------To--------------------------");
			System.out.println("---------------Programming World Bank-------------");
		   do
		   {
			   a='n';
			   
			   System.out.println("\n Please Enter Your Choice :");
			   System.out.println("1.Create New Account");
			   System.out.println("2.Existing Account");
			   System.out.println("3.Delete Account");
			   System.out.println("4.Update Account");
			   System.out.println("5.EXIT");
			   choice=scan.nextInt();
			   System.out.println("-----------------------------------------------------------------------");
			   
			   if(choice>5 || choice<1)
			   {
				   System.out.println("\n Oops !!! You Have Entered Your Wrong Choice....");
				   System.out.println("-------------------------------------------------------------------");
				   System.out.println("D You Want To Continue(Y/N) :");
				   a=scan.next().charAt(0);
				   System.out.println("--------------------------------------------------------------------");
				   
			   }
			  
		   }while(a=='Y' || a=='Y');
		   
		   switch(choice)
		   {
		   case 1:
			   U.NewUser();
			   break;
		   case 2:
			   U.ExistingUser();
			   break;
		   case 3:
			   U.DeleteAccount();
			   break;
		   case 4:
			   Up.UpdateUser();
			   break;
		   case 5:
			   System.out.println("Thank You");
			   System.out.println("          For Visiting...");
			   System.out.println("-----------------------------------------------------------------------");
		       break;
		   }
		}
		catch(InputMismatchException a)
		{
			System.out.println("----------------------------------------------------------");
			System.out.println("\nOops !!! You Have Entered Wrong Input...");
			System.out.println("----------------------------------------------------------");
		}
	}

}
