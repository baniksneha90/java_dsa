package javadsa;

class CARII{
	String brand;
	String model;
	String color;
	int price;
	
	CARII(){
		System.out.println("default");
	}
	CARII(String brand,String model){
		this.brand=brand;
		this.model=model;	
		System.out.println("BRAND:"+brand);
		System.out.println("model:"+model);
	}
	CARII(String brand,String model,String color,int price){
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
		System.out.println("BRAND:"+brand);
		System.out.println("model:"+model);
		System.out.println("color:"+color);
		System.out.println("price:"+price);
	}
	
}

public class CAR_CONStructor {

	public static void main(String[] args) {
		CARII c1=new CARII();
		System.out.println();
	    CARII c2=new CARII("maruti suzuki","odusneha");
		System.out.println();
		CARII c3=new CARII("maruti suzuki","odusneha","black",900023);
		System.out.println();

	}

}
