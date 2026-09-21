package javadsa;
class employee{
	private double salary;
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
}

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e=new employee();
		e.setSalary(100000);
		System.out.println("Salary:"+e.getSalary());

	}

}
