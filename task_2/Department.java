// Department.java
// A simple class for a department. Shows fields, a constructor,
// and a method to print the data.

public class Department {

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
