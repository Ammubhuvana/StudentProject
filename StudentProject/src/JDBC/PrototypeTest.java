package JDBC;

public class PrototypeTest {
	public Bike makeJaguar(Bike basicBike){
		basicBike.makeAdvanced();
		return basicBike;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		Bike basicBike=bike.clone();
		PrototypeTest pt = new PrototypeTest();
		Bike advancedBike= pt.makeJaguar(basicBike);
		System.out.println("Prototype Design Pattern Test-1:"+advancedBike.getModel());
		System.out.println("Prototype Design Pattern Test-2:"+advancedBike.toString());

	}

}
