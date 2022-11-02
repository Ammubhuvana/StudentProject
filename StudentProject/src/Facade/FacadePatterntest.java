package Facade;

public class FacadePatterntest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facade facade = new Facade();
		int x = 3;
		System.out.println("Cube of " + x + ":" +
		facade.cubeX(3));
		System.out.println("Cube of " + x + " times 2:" +
		facade.cubeXTimes2(3));
		System.out.println(x + " multiply class1 & class2 :" +
		facade.multiplyBoth(3));
		

	}

}
