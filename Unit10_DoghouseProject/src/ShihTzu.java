
public class ShihTzu extends Dog implements Walkable {
//sub classes can only have one super class
	//how can we get more functionality?
		//interfaces
	private int Legs = 4;
	public int getLegs() {
		return Legs;
	}
	public void setLegs(int num) {
		//return 0;
	}
	public void walkForward() {
		System.out.println("Took 5 steps forward.");
	}
	public void walkBackward() {
		System.out.println("Took 5 steps backward.");
	}
	public void handstand() {
		System.out.println("Great job!");
	}

}
