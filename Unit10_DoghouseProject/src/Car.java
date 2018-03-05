
public class Car implements Drivable {
int wheels = 0;
static int maxLoad = 1500;//in lbs
static int numDoors = 4;
//applies and is the same for all Car objects

public static void unlock(int buttonPress) {
	for(int x = 0; x < buttonPress; x++) {
		System.out.println("Beep-Beep");
	}
}
	public int getMaxLoad(int) {
		
	}
	public void setWheels(int num) {
		this.wheels = num;
	}
	public int getWheels() {
		return 0;
	}
	public void turnLeft() {
		System.out.println("Turning left");
	}
	public void turnRight() {
		System.out.println("Turning right");		
	}
}
