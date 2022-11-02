package Adapter;

public class AdapterPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
		apple.getAppleColor("blue");
		Orange orange = new Orange();
		AppleAdapter adapter = new AppleAdapter(orange);
		adapter.getAppleColor("black");
		

	}

}
