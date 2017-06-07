package inheritance;

public abstract class FuelPoweredVehicle extends DeliveryVehicle {
	private double fuelLevel; // in gallons
	private double tankSize; // in gallons
	private double efficiency; // in miles per gallon
	protected double range = fuelLevel * efficiency;

	public FuelPoweredVehicle(int wheelNumber, String make, String model, double speed, double tankSize,
			double efficiency) {
		super(wheelNumber, make, model, speed);
		this.tankSize = tankSize;
		this.fuelLevel = tankSize; // on construction, all tanks are full
		this.efficiency = efficiency;
	}

	@Override
	public String timeToTravel(double distance) {
		double time = distance / speed;
		this.traveled(distance);
		if (this.needFuel()) {
			time = time + 0.5; //adds one half hour if refueling has to happen
			this.refuel(); // restores fuelLevel to the tank capacity
		} 
		return "It would take " + time + " hours for " + this + " to travel " + distance + " miles.";
	}

	public String range() {
		double range = fuelLevel * efficiency;
		return "The range of " + this + " is " + range + " miles";
	}

	public double traveled(double distance) {
		double fuelUsed;
		fuelUsed = distance / efficiency;
		return fuelLevel -= fuelUsed;
	}

	public boolean needFuel() {
		return fuelLevel <= range;
	}

	public double refuel() {
		if (fuelLevel <= 0) {
			fuelLevel = tankSize;
		}
		return fuelLevel;
	}

}
