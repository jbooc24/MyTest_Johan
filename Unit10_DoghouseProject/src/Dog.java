
public class Dog 
{
	public int numTimesFed = 0;
	private boolean sleeping = false;
	private String name = "Ace";
	
	public String getName()
	{
		
		return name;
	}
	
	public void wakeUp()
	{
		System.out.println("WAKING UP...");
		sleeping = false;
		numTimesFed = 0;
	}
	
	public void sleep()
	{
		sleeping = true;
		System.out.println("SLEEPING...");
	}
	
	public void hear(String sound)
	{
		if(sleeping)
		{
			return;
		}
		else
		{
			if(sound.equals("Ace"))
			{
				System.out.println("WAG TAIL");
			}
			
			if(sound.equals("ding-dong"))
			{
				System.out.println("BARK");
			}
		}
	}
	
	public void feed()
	{
		if(sleeping)
		{
			return;
		}

		numTimesFed++;
		if(numTimesFed > 2)
		{
			System.out.println("YAWN");
		}					
		else
		{
			System.out.println("YUMMY");
			

		}

	}
}
