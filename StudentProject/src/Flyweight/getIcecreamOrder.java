package Flyweight;

public class getIcecreamOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IcecreamShop icecreamShop = new IcecreamShop();
		 
		    icecreamShop.getIcecreamOrder("Vanilla", 2);
		    icecreamShop.getIcecreamOrder("Butter Scotch", 15);
		    icecreamShop.getIcecreamOrder("Cone", 7);
		    icecreamShop.getIcecreamOrder("Mango", 3);
		    icecreamShop.getIcecreamOrder("Apple", 5);
		    icecreamShop.getIcecreamOrder("Pineapple", 4);
		    icecreamShop.getIcecreamOrder("Two in One", 10);
		    icecreamShop.getIcecreamOrder("Butter Milk", 12);
		    icecreamShop.getIcecreamOrder("Lemon", 9);
		    icecreamShop.getIcecreamOrder("Chocolate", 13);
		    
		    icecreamShop.icecreamService();
		    System.out.println(icecreamShop.report());
		  }
}	


	


