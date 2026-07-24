package java1;

public class Constructor_student {
	

	    // Instance variables
	    int rollNo;
	    String name;
	    int age;

	    // Parameterized Constructor
	    Constructor_student(int rollNo, String name, int age) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.age = age;
	    }

	    // Method to display student details
	    void display() {
	        System.out.println("Roll No : " + rollNo);
	        System.out.println("Name    : " + name);
	        System.out.println("Age     : " + age);
	    }

	    public static void main(String[] args) {

	        // Creating object using parameterized constructor
	    	Constructor_student s1 = new Constructor_student(101, "Prachi", 22);

	        // Displaying student details
	        s1.display();
	    }
	}


