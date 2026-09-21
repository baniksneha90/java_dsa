package javadsa;
class shape{
	void displaycolor() {
		System.out.println("this is a shape");
	}
}
class cir extends shape{
	void area() {
		double radius=5;
		double area=3.14*radius*radius;
		System.out.println("area=:"+area);
	}
}


public class shapecircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cir c1 =new cir();
		c1.displaycolor();
		c1.area();

	}

}
