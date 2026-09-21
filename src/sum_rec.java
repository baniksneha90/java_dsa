
public class sum_rec {

	public static void main(String[] args) {
		System.out.println(sum(1234));
	}
		// TODO Auto-generated method stub
		static int sum(int n) {
			if(n==0) {
				return 0;
				
			}
			return(n%10)+sum(n/10);
			
		}

	}



