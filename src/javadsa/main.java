package javadsa;
class pen{
	String color;
	String type;
	// constructor
	pen(String type,String color){
		this.type=type;
		this.color=color;
		
	}
	void display(){
		System.out.println("type: "+type);
		System.out.println("color: "+color);
	}
}

public class main {
	public static void main(String args[]) {
		// object creation
		pen pen1=new pen("ball","blue");
		pen1.display();
		
		}
	

}
