package StringPackage;

public class TestProduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product product=new Product();//--->default constructor
System.out.println(product.P_name);
System.out.println(product.P_id);

Product product1=new Product();
System.out.println(product1.P_name);
System.out.println(product1.P_id);

Product product2=new Product();
System.out.println(product2.P_name);
System.out.println(product2.P_id);

Product product3=new Product("nisha",200);
System.out.println(product3.P_name);
System.out.println(product3.P_id);

 product3=new Product("pooja",500);
System.out.println(product3.P_name);
System.out.println(product3.P_id);



	}

}
