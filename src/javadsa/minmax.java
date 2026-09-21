package javadsa;

public class minmax {

	public static void main(String[] args) {
		int[][]arr= {
				{2,4},
				{1,5,6},
				{7,8,0}
		};
		int max=arr[0][0];
		int min=arr[0][0];
		for (int r = 0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++) {
				if(arr[r][c]>max) {
					max=arr[r][c];
				}
				if(arr[r][c]<min) {
					min=arr[r][c];
				}
			}
		}
		System.out.println(max);
		System.out.println(min);
		}

	}


