
public class House 
{

	public static void main(String[] args) 
	{
		Mouse myMouse = new Mouse();
		//don't want the variables to be easy to change
		//myMouse.name = "Minnie";
		//System.out.println(myMouse.name);
		//now inaccessible due to being private
		
		//how to change the variable
		myMouse.setName("Minnie");
		
		//how to access private variable
		System.out.println(myMouse.getName());
		
		myMouse.eat();
		myMouse.goToSleep();
		myMouse.eat(); //should not count
		myMouse.eat(); //should not count
		myMouse.wakeUp();
		myMouse.caughtInTrap();
		myMouse.eat(); //should not count
		System.out.println(myMouse.cheeseEaten); //resets when sleeping
		
		if(myMouse.getName().equals("Minnie"))
		{
			System.out.println("Squeal!");
		}
	}

}
