package javadsa;

public class count_occur {

	public static void main(String[] args) {
		int[]arr= {2,3,2,5,2,7};
		System.out.println(count(arr, 2, 0));

	}
	static int count(int[]arr,int target,int index) {
		if(index==arr.length) {
			return 0;
		}
		if(arr[index]==target) {
			return 1+count(arr,target,index+1);
		}
		return count(arr,target,index+1);
	}

}
