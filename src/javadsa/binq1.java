package javadsa;

public class binq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5,6,7,8,9};
		int target=8;
		int start=0;
		int end=arr.length-1;
		while(start<= end) {
			int mid=start+(end-start)/2;
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
				
			}
			else {
				System.out.println("found at index"+mid);
				break;
			}
		}

	}

}
