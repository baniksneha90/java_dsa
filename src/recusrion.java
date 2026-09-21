
public class recusrion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println(isPalindrome("snehaa",0,5));
	}
	
	static boolean isPalindrome(String str, int i, int j){
			if(i>=j) {
				return true ;
			}
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			
			 return isPalindrome(str,i+1,j+1);
			
		}
	}
	
			

	


