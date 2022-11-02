package Interface;


import Interface.Samsung.SamsungMobileFactory;

interface IMobileFactory {
	 IMobileFactory createMobile(String type);
	 }

 class MobileFactory implements IMobileFactory {
	 @Override
	 public IMobileFactory createMobile(String type) {
		 IMobileFactory mob = null;
		 if ("lenf".equalsIgnoreCase(type)){
			 mob= new LenovoMobileFactory();
			 } else if ("samf".equalsIgnoreCase(type)){
				 mob= new SamsungMobileFactory();
				 }
		 return mob;
		 }
	 }

 
 

public class AbstractFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileFactory factory= new MobileFactory();
		LenovoMobileFactory lmf=
		(LenovoMobileFactory)factory.createMobile("lenf");
		Lenovo ln= (Lenovo)lmf.createLenovoMobile();
		ln.pictureCapacity();
		}

	}


