package javadsa;

public class String_search {

	public static void main(String[] args) {
		String []arr= {"Sneha","java","python"};
		String target="Sneha";
		int index= -1;
		for(int i =0;i<arr.length;i++) {
			if (arr[i].equals(target)) {
				index=i;
				break;
			}
		}
		if (index!=-1) {
			System.out.println("found at index"+ index);
		}else {
			System.out.println(" not found at index");
			
		}
		
	}

}
