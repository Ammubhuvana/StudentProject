package StringPackage;

public class Product {
	String P_name;
	int P_id;
	Product()
	{
		System.out.println("no arguement constructor");
	    P_name="bhuvana";
	}
	Product(String P_name,int P_id)
	{
		System.out.println("parameterized constructor");
        this.P_name=P_name;
        this.P_id=P_id;
	}
	

	
}
