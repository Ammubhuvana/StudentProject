import java.util.Scanner;




 public class AtmInterface {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=5000,withdraw,deposit;
		Scanner a=new Scanner(System.in);
		while(true)
		{
			System.out.println("Automated Teller Machine");
			System.out.println("choose 1 for Withdraw");
			System.out.println("choose 2 for Deposit");
			System.out.println("choose 3 for Check Balance");
			System.out.println("choose 4 for Exit");
			System.out.println("choose the operation you want to perform:");
			
			int n=a.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("Enter money to be Withdraw:");
				withdraw=a.nextInt();
				
				if(balance>=withdraw)
				{
					balance=balance-withdraw;
					System.out.println("please collect your money");
					
				}
				System.out.println("");
				break;
			case 2:
				System.out.println("Enter money to be deposited:");
				deposit=a.nextInt();
				
				balance=balance+deposit;
				System.out.println("your money has been successfully deposited");
				System.out.println("");
				break;
			case 3:
				System.out.println("Balance:"+balance);
				System.out.println("");
				break;
			case 4:
				System.exit(0);
				
				
			}
		
		}
	}
 }
		

	
	