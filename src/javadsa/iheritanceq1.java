package javadsa;
// Inheritance allows one class to acquire,
//the properties and methods of another class.
//Animal is the Parent (Super) Class
//Dog is the Child (Sub) Class
class Animal{
	void sound() {
		System.out.println("animlas make sounds");
	
	}
}
 class Dog extends Animal{
	 
 }
public class iheritanceq1 {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.sound();
		

	}

}
