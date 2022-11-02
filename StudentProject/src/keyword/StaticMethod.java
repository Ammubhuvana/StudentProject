package keyword;

public class StaticMethod {
	static int a=10;
	
	
	public void display()
	{
		System.out.println("This ia an instance method");
		;
		
	}
	public static void show()
	{
		System.out.println("This is a Static method");
		//System.out.println("Non static variable:"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod st=new StaticMethod();
		st.display();
		StaticMethod s=null;
		s.show();
		int c=s.a;
		System.out.println(c);
		
	}

}
