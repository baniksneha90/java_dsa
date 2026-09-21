 package javadsa;

public class binsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Basics of binary search(points to keep in mind)
 * first find the middle element
 * target>mid= search in the right (it is a sorted array) 
 * if middle element== target element// ans 
 * 
 */
		        int[] arr = {1,2,3,4,5,6,7,8,9};

		        int start = 0;
		        int end = arr.length - 1;
		        int target = 8;

		        while(start <= end) {

		            int mid = start + (end - start) / 2;

		            if(target == arr[mid]) {
		                System.out.println("Found at index " + mid);
		                break;
		            }
		            else if(target < arr[mid]) {
		                end = mid - 1;
		            }
		            else {
		                start = mid + 1;
		            }
		        }
		    }
		}
		
	


