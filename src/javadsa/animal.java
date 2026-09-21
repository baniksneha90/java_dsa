package javadsa;
 class Ani{
	 void sound() {
		 System.out.println("animal makes a sound");
	 }
 }
class cat extends Ani{
	void sound() {
		 System.out.println("Cat meows");
	}
}
public class animal {

	public static void main(String[] args) {
		cat c1=new cat();
		c1.sound();
	}

}
