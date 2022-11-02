package keyword;

public class Main {
	final int x=10;
	Main()
	{
		System.out.println("This is an default constructor");
		
	}
	final void display()
	{
		System.out.println("value of x is:"+x);
	}
	class FinalMethod1 extends Main
	{
		void display()
		{
			System.out.println("this is an overridden method");
		}
		
	}
	class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FinalMethod1 fm=new FinalMethod1();
        fm.display();
	}

}
