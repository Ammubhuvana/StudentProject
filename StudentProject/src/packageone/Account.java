package packageone;
import java.util.Scanner;
public class Account {
	String account_Name;
	int account_Number;
	double account_Amount;
	double account_Deposit;
	double account_Withdraw;
	double account_checkBalance;
	public void accountDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter account_Name:,account_Number:,account_Amount:,account_Deposit:account_Withdraw:,account_checkBalance");
		account_Name=scanner.next();
		account_Number=scanner.nextInt();
		account_Amount=scanner.nextDouble();
		account_Deposit=scanner.nextDouble();
		account_Withdraw=scanner.nextDouble();
		
		
		
	}
	public void accountprintDetails()
	{
		System.out.println(" account_Name:"+account_Name+" "+"account_Number:"+account_Number+" "+
	"account_Amount:"+account_Amount+" "+"account_Deposit:"+account_Deposit+" "+"account_Withdraw:"+account_Withdraw+" "+
				"account_checkBalance:"+account_checkBalance);
	}
	public void depositAmount()
	{
		Scanner scanner=new Scanner(System.in);
		double deposit;
		deposit=account_Amount+account_Deposit;
		System.out.println("deposit:"+deposit);
	}
	public void withDrawAmount()
	{
		Scanner scanner=new Scanner(System.in);
		double withDraw;
		withDraw=account_Amount-account_Deposit;
		System.out.println("withDraw:"+withDraw);
	}
	public void checkBalance()
	{
		double checkBalance=0;
		checkBalance=account_Amount+account_Deposit-account_Withdraw;
		System.out.println("checkBalance:"+checkBalance);
	}
	
	
	
	
	

}
