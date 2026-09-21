
package javadsa;
class emp{
	String name="sneha";
	int salary= 1200000;
	void displayemp() {
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
		
	}
}
class manager extends emp{
	String department="VLSI ENGINEER";
	void displaymanager() {
		System.out.println("department:"+department);
		
	}
}

public class inheriq4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager m1=new manager();
		m1.displayemp();
		m1.displaymanager();

	}

}
