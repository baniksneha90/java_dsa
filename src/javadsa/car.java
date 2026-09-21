package javadsa;

class Car{
	String brand;
	String color;
	String model;
	
	Car(String brand,String color,String model){
		this.brand=brand;
		this.color=color;
		this.model=model;
		
	}

	void showDetails() {
	System.out.println("brand: "+ brand);
	System.out.println("model: "+ model);
	System.out.println("color: "+ color);
}
}
public class car {
	public static void main(String[] args) {
		Car c1=new Car("mercedes","black","ODSNEHA");
		c1.showDetails();
		

	}

}
