package keyword;

public class Customer {
	//instance variables of class customer
		String name;
		int id;
		
		//declare parameterized constructor
		Customer(String name,int id)
		{
			this.name=name;
			this.id=id;
			
			
		}
		//declare method to display customer details
		public void display()
		{
			System.out.println("Customer name is:"+name+"Id is:"+id);
			
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Customer c1=new Customer("bhuvana",100);
			
			
			c1.display();
			

		}

	}

	

	


