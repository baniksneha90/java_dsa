package javadsa;
class bachhe{
	private String name;
	private int age;
	public void setName(String name) {
		this.name=name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
}
public class encap {

	public static void main(String[] args) {
		bachhe s1=new bachhe();
		s1.setName("sneha");
		s1.setage(20);
		System.out.println("Name: " + s1.getname());
		System.out.println("age: " + s1.getage());
		
		

	}

}
