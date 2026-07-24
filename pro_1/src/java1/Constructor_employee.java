package java1;

public class Constructor_employee {

    // Instance variables
    int empId;
    String empName;
    double salary;

    // Static variable (shared by all employees)
    static String companyName = "TCS";

    // Constructor
    Constructor_employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
        System.out.println("Company Name : " + companyName);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        // Creating employee objects
    	Constructor_employee e1 = new Constructor_employee(101, "Prachi", 50000);
    	Constructor_employee e2 = new Constructor_employee(102, "Rahul", 60000);

        // Display details
        e1.display();
        e2.display();
    }


}
