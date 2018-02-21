
public class SmartPhone {

	public static void main(String[] args) 
	{
		Battery myBattery = new Battery();
	      myBattery.charge(10);
	      System.out.println("Battery is " + 
	                         myBattery.getPercentFull() + "% full");;
	}

}
