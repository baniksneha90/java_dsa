 package javadsa;
class vehicle{
	void start() {
		System.out.println("vehicle started");
	}
}
class bus extends vehicle{
	void drive() {
		System.out.println("sneha is driving car");
	}
}
public class inheriq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bus c1= new bus();
		c1.start();
		c1.drive();

	}

}
