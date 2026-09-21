package javadsa;

class rectangle{
	private int length;
	private int width;
	
	public void setlength(int length) {
		this.length=length;
	}
	public void setwidth(int width) {
		this.width=width;
	}
	public int area() {
		return length *width;
	}
}



public class Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r=new rectangle();
		r.setlength(13);
		r.setwidth(5);
		System.out.println("area:"+r.area());

	}

}
