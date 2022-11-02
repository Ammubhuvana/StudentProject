package keyword;

public class Test {
	int b;
	Test(int b)
	{
		this.b=b;
	}
	void show()
	{
		System.out.println("number:"+this.b);
		
	}
	Test decr()
	{
	b--;
	return this;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test sub=new Test(40);
		
		sub.decr().decr();
		sub.show();

	}

}
