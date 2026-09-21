package javadsa;

class c{
	void add(int a,int b ) {
		System.out.println(a + b);
	}
	void add(int a,int b ,int c) {
		System.out.println(a + b+c);
}
	void add(float a,float b) {
		System.out.println(a + b);
	}
}
public class calc {

	public static void main(String[] args) {
		c c1=new c();
		c1.add(5, 15);
		c1.add(5, 12,15);
		c1.add(2,3);

	}

}
