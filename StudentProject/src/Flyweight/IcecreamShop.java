package Flyweight;
import java.util.ArrayList;
import java.util.List;


public class IcecreamShop {
	 private final List<IcecreamOrder> icecreamOrders = new ArrayList<IcecreamOrder>();
	  private final IcecreamMenu icecreamMenu = new IcecreamMenu();
	  void getIcecreamOrder(String flavourName, int tableNumber) {
	    IcecreamFlavour flavour = icecreamMenu.lookup(flavourName);
	    IcecreamOrder order = new IcecreamOrder(tableNumber, flavour);
	    icecreamOrders.add(order);
	  }
	  void icecreamService() {
	    for (IcecreamOrder icecreamOrder : icecreamOrders) {
	      icecreamOrder.serveIcecream();
	    }
	  }
	  String report() {
	    return "Total number of Icecream flavour served : " + icecreamMenu.totalIcecreamFlavours();
	  }


}
