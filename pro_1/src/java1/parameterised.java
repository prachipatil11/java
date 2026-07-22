package java1;

public class parameterised {


	    int rollNo;
	    String name;
	    double marks;

	 
	    parameterised(int r, String n, double m) {
	        rollNo = r;
	        name = n;
	        marks = m;
	    }

	    // Method to display student details
	    void display() {
	        System.out.println("Roll No : " + rollNo);
	        System.out.println("Name    : " + name);
	        System.out.println("Marks   : " + marks);
	    }

	    public static void main(String[] args) {

	        // Creating objects using parameterized constructor
	    	parameterised s1 = new parameterised(101, "Prachi", 89.5);
	    	parameterised s2 = new parameterised(102, "Rahul", 92.0);

	        // Display details
	        s1.display();

	        System.out.println();

	        s2.display();
	    }
	}


