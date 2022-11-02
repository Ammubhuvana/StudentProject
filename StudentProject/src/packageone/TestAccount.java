package packageone;
import java.util.Scanner;
class TestAccount {
	
	public static void main(String[]args)
	{
		Account account=new Account();
		System.out.println("Enter the account details are");
		account.accountDetails();
		account.accountprintDetails();
		account.depositAmount();
		account.withDrawAmount();
		account.checkBalance();
		

	}

}
