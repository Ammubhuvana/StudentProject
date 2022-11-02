package keyword;

public class StaticVariable {
	static int counter;
	StaticVariable()
	{
		counter++;
		System.out.println("current value of the counter is:"+counter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable s1=new StaticVariable();
		StaticVariable s2=new StaticVariable();
		StaticVariable s3=new StaticVariable();

	}

}
