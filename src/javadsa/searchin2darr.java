package javadsa;

public class searchin2darr {

	public static void main(String[] args) {
		int[][]arr= {
				{2,4},
				{1,5,6},
				{7,8,0}
		};
		int target=0;
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++) {
				if(arr[r][c]==target) {
					System.out.println("row"+r+"col"+c);
					return;
				}
			}
		}

	}

}
