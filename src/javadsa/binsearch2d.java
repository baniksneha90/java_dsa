package javadsa;

public class binsearch2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int target=9;
		for (int i =0;i<arr.length;i++) {
			for (int j =0;j<arr.length;j++) {
				if(arr[i][j]==target) {
					System.out.println("found in row"+i+"col"+j);
					return;
				}
			}
		}
		System.out.println("not found");
	 	}

}
