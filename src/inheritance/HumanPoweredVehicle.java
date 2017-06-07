package inheritance;

public abstract class HumanPoweredVehicle extends DeliveryVehicle {

	// in real world, would it make sense to use this to store things like rest periods - humans are the ones doing that?
	// i.e. level of fitness would impact how long/far a bicycle could go, not the bicycle itself
	public HumanPoweredVehicle(int wheelNumber, String make, String model, double speed) {
		super(wheelNumber, make, model, speed);
	}
}
