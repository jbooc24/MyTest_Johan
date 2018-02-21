
public class Mouse 
{
	//State variables / properties
		//attributes of the class
	private String name = "Mickey";
	boolean isInTrap = false;
	int cheeseEaten = 0;
	boolean isSleeping = false;
	//Methods, what can a mouse do
		//change attributes of the mouse
	
	//Getters, Accessors
		//return a state variable's value
	public String getName()
	{
		return name;
	}
	
	//Setter, Mutator
		//changes a state variable's value
	public void setName(String n)
	{
		this.name = n;
		
	}
	
	public void caughtInTrap()
	{
		isInTrap = true;
		System.out.println("OOWWHHHHHH!!!");
	}
	
	public void goToSleep()
	{
		isSleeping = true;
		System.out.println("SSSNNNNOOZZZEE");
		cheeseEaten = 0;
	}
	
	public void wakeUp()
	{
		isSleeping = false;
	}
	
	public void eat()
	{
		if(isSleeping || isInTrap)
		{
			return;
		}
		else
		{
		cheeseEaten++;
		System.out.println("Ate one piece of Cheese");
		}
	}
	
}
