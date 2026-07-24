package java1;

public class Constructor_static {
	

	    // Static variable to count objects
	    static int count = 0;

	    // Constructor
	    Constructor_static() {
	        count++; // Increases count whenever an object is created
	    }

	    // Method to display total objects
	    void displayCount() {
	        System.out.println("Total Objects Created: " + count);
	    }

	    public static void main(String[] args) {

	        // Creating objects
	    	Constructor_static s1 = new Constructor_static();
	    	Constructor_static s2 = new Constructor_static();
	    	Constructor_static s3 = new Constructor_static();

	        // Display total number of objects
	        s3.displayCount();
	    }
	}


