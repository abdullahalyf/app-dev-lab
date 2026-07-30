// Main.java
// Task 2: Create multiple classes (University, Student, Department),
// then create objects and print their data. Demonstrates basic OOP concepts.

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
