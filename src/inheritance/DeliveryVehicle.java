package inheritance;

public abstract class DeliveryVehicle {

	private int wheelNumber;
	protected double speed;
	private String make;
	private String model;

	@Override
	public String toString() {
		return "Vehicle: " + make + " " + model + " with " + wheelNumber + " wheels";
	}

	public DeliveryVehicle(int wheelNumber, String make, String model, double speed) {
		this.wheelNumber = wheelNumber;
		this.make = make;
		this.model = model;
		this.speed = speed;
	}

	public String timeToTravel(double distance) {
		double time = distance / speed;
		return "It would take " + time + " hours for " + this + " to travel " + distance + " miles.";
	}

	public String distanceTraveled(double time) {
		double distance = speed * time;
		return "In " + time + " hours, " + this + " would travel " + distance + " miles";
	}

}
