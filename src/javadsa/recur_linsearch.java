package javadsa;

public class recur_linsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,3,4,1,5};
		System.out.println(find(arr,4,0));

	}
	static boolean find(int[]arr,int target,int index) {
		if (index==arr.length) {
			return false;
		}
		return arr[index]==target || find(arr,target,index);
		
	}

}
