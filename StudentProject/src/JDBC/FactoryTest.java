package JDBC;

 interface IMobile{
	public void cost();
	public void pictureCapacity();
	public void batteryPower();
	
}
 class Lenovo implements IMobile{
	@Override
	public void cost() {
		System.out.println("Lenovo Cost starts from 10000");
	}
	@Override
	public void pictureCapacity() {
		System.out.println("Lenovo camera capacity starts from 10MP");
		}
	@Override
	public void batteryPower() {
		System.out.println("Lenovo battery power starts from 2500MAh");
		}
	}
   class Samsung implements IMobile {
	   @Override
	   public void cost() {
		   System.out.println("Samsung Cost starts from 6000");
		   }
	   @Override
	   public void pictureCapacity() {
		   System.out.println("Samsung camera capacity starts from 4MP");
		   }
	   @Override
	   public void batteryPower() {
		   System.out.println("Samsung battery power starts from 1200MAh");
		   }
	   }
    class MobileFactory {
	   public MobileFactory(){
	   }
	   IMobile createMobile(String type){
	   IMobile mob=null;
	   if("len".equalsIgnoreCase(type)){
	   mob=new Lenovo();
	   System.out.println("Lenovo created");
	   }else if("sam".equalsIgnoreCase(type)){
	   mob=new Samsung();
	   System.out.println("Samsung created");
	   }
	   return mob;
	   }
	   }
	  
	public class FactoryTest {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			 MobileFactory factory= new MobileFactory();
			   Lenovo len = (Lenovo)factory.createMobile("len");
			   len.batteryPower();
			   Samsung sam= (Samsung)factory.createMobile("sam");
			   sam.cost();
		}
	}
		
		
	
		

