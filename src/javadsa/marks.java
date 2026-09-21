package javadsa;
class result{
	private int marks;
	public void setmarks(int marks) {
		this.marks=marks;
	}
	public int getmarks() {
		return marks;
	}
	public void pass() {
		if(marks>=40)
			System.out.println("pass");
		else
			System.out.println("fail");
	}
}

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result r= new result();
		r.setmarks(90);
		System.out.println("marks:"+r.getmarks());
		r.pass();

	}

}
