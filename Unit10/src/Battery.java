
public class Battery 
{
	
	   int percentFull = 0;

	   public void charge(int increase)
	   {
	      percentFull += 10;
	   }

	   public int getPercentFull()
	   {
	      return percentFull;
	   }
}



