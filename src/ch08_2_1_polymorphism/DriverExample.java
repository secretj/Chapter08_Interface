package ch08_2_1_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Vehicle vehicle = new Bus();
		Vehicle vehicle2 = new Taxi();
		Train train= new Train();
		
		driver.drive(vehicle);
		driver.drive(vehicle2);
		driver.drive(train);
		

	}

}




