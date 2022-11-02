package Interface;

 interface Engine {
	void changeGear(int a);
	void speedUp(int a);
	}
	 class Vehicle implements Engine 
	 {
		int speed;
		int gear;
	  
     public void speedUp(int a)
    {
		 this.speed=a;
		 
		System.out.println("speed"+speed);
	}
	public void changeGear(int a) 
	{
		this.gear=a;
		System.out.println("gear"+gear);
	}
		public static void main(String[] args) {
		// TODO Auto-generated method
		Vehicle v=new Vehicle();
		 
		v.changeGear(3);
		v.speedUp(70);
		}
		}


