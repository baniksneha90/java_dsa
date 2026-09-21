
public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(5));
	}
	static int fibo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}

	}


