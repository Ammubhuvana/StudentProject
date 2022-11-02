package Interface;


interface ParentA
{
	public void walk();
}

interface ParentB
{
	public void walk();
	public void run();
}
class child implements ParentA,ParentB
{   
	public void walk()
	{
		System.out.println("ParentA is walking ");
	}
    public void run()
    {
    	System.out.println("ParentB is running ");
    }
    public static void main (String args[])
    {
    	child object = new child();
    	object.walk();
    	object.run();
    }
}
