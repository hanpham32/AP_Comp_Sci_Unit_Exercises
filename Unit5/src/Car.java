
public class Car extends Vehicle{
	public static int oddNum = 1;
	public final int MAX_SPEED = 60;
	public final int WEIGHT = 4000;
	public final int gasMILEAGE = 40;
	
	// Constructor
	public Car() {
		super("C" + oddNum);
		oddNum += 2;
	}
	
	// Behaviors
	public void openTrunk() {
		System.out.println("Opening Trunk");
	}
	
	public void closeTrunk( ) {
		System.out.println("Closing Trunk");
	}
	
	// ACCESSOR
	public int getMaxSpeed() {
		return MAX_SPEED;
	}
	public int getWeight() {
		return WEIGHT;
	}
	public int getGasMileage() {
		return gasMILEAGE;
	}
}
