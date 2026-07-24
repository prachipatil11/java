package java1;

public class Overloading_student {

	    int rollNo;
	    String name;
	    double marks;

	    // Default Constructor
	    Overloading_student() {
	        rollNo = 0;
	        name = "Not Assigned";
	        marks = 0.0;
	    }

	    // Constructor with 2 parameters
	    Overloading_student(int rollNo, String name) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.marks = 0.0;
	    }

	    // Constructor with 3 parameters
	    Overloading_student(int rollNo, String name, double marks) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.marks = marks;
	    }

	    // Method to display student details
	    void display() {
	        System.out.println("Roll No : " + rollNo);
	        System.out.println("Name    : " + name);
	        System.out.println("Marks   : " + marks);
	        System.out.println("----------------------");
	    }

	    public static void main(String[] args) {

	    	Overloading_student s1 = new Overloading_student();
	    	Overloading_student s2 = new Overloading_student(101, "Prachi");
	    	Overloading_student s3 = new Overloading_student(102, "Rahul", 89.5);

	        s1.display();
	        s2.display();
	        s3.display();
	    }
	}

