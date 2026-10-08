package placement;

public class Q_2MIN_ELEMENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {31, 2 , 25, 16,98};
		int min =arr[0];
		for (int i =0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.print(min);

	}

}
