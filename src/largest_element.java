package placement;

public class largest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 45, 7, 23, 89, 34};
		int l=arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>l) {
				l=arr[i];
				
			}
		}
		System.out.print(l);

	}

}
