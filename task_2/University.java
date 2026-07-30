// University.java
// A simple class for a university. Holds a name and two departments.
// Shows composition — a University "has" Departments.

public class University {

    private String name;
    private Department dept1;
    private Department dept2;

    // Constructor
    public University(String name, Department dept1, Department dept2) {
        this.name = name;
        this.dept1 = dept1;
        this.dept2 = dept2;
    }

    // Method to print the university name and its departments
    public void displayInfo() {
        System.out.println("University Name: " + name);
        System.out.println("Departments:");
        System.out.println("  - " + dept1.getName());
        System.out.println("  - " + dept2.getName());
    }

    // Method to print full details of every department
    public void displayAllDepartments() {
        System.out.println("--- Department Details ---");
        dept1.displayInfo();
        System.out.println();
        dept2.displayInfo();
    }
}
