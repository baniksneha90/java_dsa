package javadsa;

class circle{
	double radius;
	circle(double radius){
		this.radius=radius;
		
	}
	void calcarea() {
		double area=3.14*radius*radius;
		System.out.println(area);
		
		
	}
}
public class OOPQ4 {

	public static void main(String[] args) {
		circle c1=new circle(4);
		circle c2= new circle(5);
		c1.calcarea();
		c2.calcarea();

	}

}
