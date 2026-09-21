package javadsa;
class person{
	String name="sneha";
	void displayname() {
		System.out.println("name:"+name);
}
}
class students extends person{
	String branch="ece";
	void displaybranch() {
		System.out.println("branch:"+branch);
	}
	
}

public class INHERIq3 {

	public static void main(String[] args) {
		students s1=new students();
		s1.displayname();
		s1.displaybranch();
		

	}

}
