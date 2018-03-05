
public class Builder extends Person implements iBuildable, iLivable {

	int bricksLaid = 0;
	private static String message = "Your quote for this job is ";
	public static void main(String[] args) {

	}
	public void placeBrick(int num) {
		bricksLaid+=num;
	}
	public int getBricksLaid() {
		return bricksLaid;
	}

}
