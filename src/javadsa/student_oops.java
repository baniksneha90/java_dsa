package javadsa;

class Student{
	int rno;
	String name;
	String branch;
	
	Student(String name,int rno ,String branch){
		this.name=name;
		this.branch=branch;
		this.rno=rno;
		
	}
	void display() {
		System.out.println("name: "+name);
		System.out.println("rno: "+rno);
		System.out.println("branch: "+branch);
		
	}
	}


public class student_oops {

	public static void main(String[] args) {
		Student s1=new Student("sneha",2,"ece");
		s1.display();

	}

}
