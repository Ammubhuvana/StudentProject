package keyword;

public class FinalVariableEx1 {
	final int age;
	final static int a;
	FinalVariableEx1()
	{
		age=23;
	}
	void displayValue()
	{
		System.out.println("age:"+age);
	}
	static
	{
	    a=25;
		System.out.println("value of a:"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariableEx1 fv=new FinalVariableEx1();
		fv.displayValue();

	}

}
