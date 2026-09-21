package javadsa;

public class linear_search {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4};
		int target=4;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
				}
		}
		if(index!=-1) {
			System.out.println("Index found:"+target);
			
		}else {
			System.out.println("Index  not found");
			
		}
	}

} 
