package javadsa;
class student{
	void display(String name) {
		System.out.println(name);
	}
	void display(String name,int age) {
		System.out.println(name);
		System.out.println(age);
		
	}
	void display(String name,int age,String branch) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(branch);
		
	
}
}
public class moq2 {

	public static void main(String[] args) {
		//object creation 
		student s1=new student();
		s1.display("sneha");
		System.out.println();
		s1.display("sneha",20);
		System.out.println();
		s1.display("sneha",20,"ece");
		System.out.println();
		

	}

}

