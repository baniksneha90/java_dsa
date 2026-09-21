package javadsa;

public class array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,20,30,40,50};
		System.out.println(find(arr,40,0));
		

	}static int find(int[]arr,int target,int index) {
		if(index==arr.length) {
			return -1;
			
		}
		if(arr[index]==target) {
			return index;
		}
		return find(arr,target,index+1);
	}
	

}
