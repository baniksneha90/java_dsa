package javadsa;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rev(8112,0);

	}
	static void rev(int n,int rever) {
		if(n==0) {
		System.out.println(rever);
		return;	
	}
	
	rever=rever*10 +(n%10);
	rev(n/10,rever);

}
}