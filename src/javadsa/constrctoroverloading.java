package javadsa;
class book{
	String title;
	String author;
	double price;
	
	book(){
		System.out.println("Default constructor");
	}
	book(String title){
		this.title=title;
		System.out.println("Title"+title);
	}
	book(String title,String author){
		this.title=title;
		this.author=author;
		System.out.println("title:"+title);
		System.out.println("author:"+author);
		System.out.println("price:"+price);
	}
}

public class constrctoroverloading {

	public static void main(String[] args) {
		book b1= new book();
		System.out.println();
		book b2=new book("java program");
		System.out.println();
		book b3= new book("java prgm","jp morgan");
		System.out.println();
		

	}

}
