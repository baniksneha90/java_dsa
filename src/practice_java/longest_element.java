
public class longest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,25,5,20,15};
		int largest=arr[0];
		int sec_largest=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				sec_largest=largest;
				largest=arr[i];
			}
			else if (arr[i]>sec_largest && arr[i]!=largest) {
				sec_largest=arr[i];
			}
			
		}
		System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + sec_largest);
	}
}
