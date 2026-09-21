package javadsa;

public class bin_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,4,4,4,5,7};
		int target=4;
		int start=0;
		int end= arr.length-1;
		int ans=-1;
		while(start<=end) {
			int mid= start+(end-start)/2;
			if(target==arr[mid]) {
				ans=mid;
				end=mid-1;
			}
			else if (target>=arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
				
			}
		}
		System.out.println(ans);

	}

}
