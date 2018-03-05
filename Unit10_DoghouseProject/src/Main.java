
public class Main {

	public static void main(String[] args) {
		ShihTzu benny = new ShihTzu();
		benny.handstand();
		Car tesla = new Car();
		Car volvo = new Car();
		System.out.println("Tesla max load " + tesla.getMaxLoad());
		System.out.println("Tesla max load " + volvo.getMaxLoad());
		tesla.unlock(2);
		volvo.unlock(3);


		
		/*
		Dog Sam = new Dog();
	//Class name, object, new, class name
		
		Dog Jim = new Dog(true, "Jim");
		Jim.feed();
		Jim.feed();
		Jim.getName();
		System.out.println(Jim.name);
		*/
	}

}
