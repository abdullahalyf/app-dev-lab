// Student.java
// A simple class for a student. Shows basic OOP ideas:
// private fields, a constructor, getters/setters, and a display method.

public class Student {

    // Fields (private so they can only be changed through methods)
    private String name;
    private String studentId;
    private String department;

    // Constructor — runs when we write: new Student(...)
    public Student(String name, String studentId, String department) {
        this.name = name;
        this.studentId = studentId;
        this.department = department;
    }

    // Getters — let us read the fields from outside
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    // Setters — let us update the fields from outside
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
