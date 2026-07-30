// Main.java
// Task 2: Create multiple classes (University, Student, Department),
// then create objects and print their data. Demonstrates basic OOP concepts.
//
// All classes live in this single file for simplicity. Only the file's
// filename class (Main) is public; the helper classes are package-private.

// ---- Student class ----
class Student {

    // Private fields
    private String name;
    private String studentId;
    private String department;

    // Constructor
    public Student(String name, String studentId, String department) {
        this.name = name;
        this.studentId = studentId;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to print all info about this student
    public void displayInfo() {
        System.out.println("    Student Name: " + name);
        System.out.println("    Student ID:   " + studentId);
        System.out.println("    Department:   " + department);
    }
}

// ---- Department class ----
class Department {

    // Private fields
    private String name;
    private String code;

    // Constructor
    public Department(String name, String code) {
        this.name = name;
        this.code = code;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    // Method to print department info
    public void displayInfo() {
        System.out.println("  Department Name: " + name);
        System.out.println("  Department Code: " + code);
    }
}

// ---- University class ----
class University {

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

// ---- Main class (entry point) ----
public class Main {

    public static void main(String[] args) {

        // Step 1: Create Department objects
        Department cse = new Department("Computer Science & Engineering", "CSE");
        Department eee = new Department("Electrical & Electronic Engineering", "EEE");

        // Step 2: Create a University object and pass departments to it
        University diu = new University("Daffodil International University", cse, eee);

        // Step 3: Create Student objects
        Student alice = new Student("Alice", "221-15-001", "CSE");
        Student bob   = new Student("Bob",   "221-15-002", "EEE");

        // Step 4: Print the data
        System.out.println("=== University Info ===");
        diu.displayInfo();

        System.out.println();
        System.out.println("=== Department Details ===");
        diu.displayAllDepartments();

        System.out.println();
        System.out.println("=== Student Info ===");
        alice.displayInfo();

        System.out.println();
        bob.displayInfo();
    }
}
