package inheritance;

public class DeliveryVehicleApp {

	public static void main(String[] args) {
		DeliveryVehicle bicycle = new Bicycle();
		System.out.println(bicycle);

		System.out.println(bicycle.timeToTravel(20));
		System.out.println(bicycle.distanceTraveled(2));
		
		FuelPoweredVehicle airplane = new Airplane("Boeing", "777");
		
		System.out.println("Airplane range before travel:");
		System.out.println(airplane.range());
		//airplane travels 50000 miles
		System.out.println("Airplane range after travelling 50000 miles:");
		airplane.traveled(50000);
		// return range
		System.out.println(airplane.range());
		
		FuelPoweredVehicle van = new Van("Chevrolet", "Express Cargo");
		
		System.out.println(van.range());
		System.out.println(van.timeToTravel(300));
		System.out.println(van.range());
		System.out.println(van.timeToTravel(300));
		System.out.println(van.range());
	

	}

}
