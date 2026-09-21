package javadsa;
class acc{
	private double balance;
	public void deposit(double amount) {
		balance+=amount;
		
	}
	public double getBalance() {
		return balance;
	}
}

public class bankaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		acc a=new acc();
		a.deposit(1000000);
		System.out.println("Balance=" +a.getBalance());

	}

}
