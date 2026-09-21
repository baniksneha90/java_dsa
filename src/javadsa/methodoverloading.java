package javadsa;

public class methodoverloading {
	class Student {

	    Student() {
	        System.out.println("Default Constructor");
	    }

	    Student(String name) {
	        System.out.println("Name: " + name);
	    }

	    Student(String name, int age) {
	        System.out.println(name + " " + age);
	    }
	}
}
