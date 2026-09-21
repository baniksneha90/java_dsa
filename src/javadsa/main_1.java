package javadsa;
class aniiimal{
	void eat() {
		System.out.println("animal is eating ");
	}
}
class dog extends aniiimal{
	void bark() {
		System.out.println("dog is barking ");
	}
}
	

public class main_1 {

	public static void main(String[] args) {
		dog d= new dog();
		d.eat();
		d.bark();

	}

}
