// Main.java
// Task 2: create a few classes (Student, Department, University) and use them.
//
// In real life, every class usually lives in its own file. But for a beginner
// exercise, putting them all in one file is simpler — Java allows this as
// long as only the public class (Main) is named after the file.
//
// What's an object? Think of a "Student" as a template. A real student like
// "Abdullah" is one *object* made from that template. Each object has its own
// data (name, ID, etc.).

// -------- Student class --------
// A Student has three pieces of info: name, ID, and the department they belong to.
class Student {

  // These are the "fields" — the data each Student object carries.
  // We mark them "private" so nothing outside this class can read or change
  // them directly. They have to go through the methods below (getters/setters).
  private String name;
  private String studentId;
  private String department;

  // Constructor: this special method runs when we do "new Student(...)".
  // It takes the values we pass and stores them inside this object.
  public Student(String name, String studentId, String department) {
    this.name = name; // "this.name" means the field of *this* object
    this.studentId = studentId;
    this.department = department;
  }

  // "Getters" — let other code *read* the private fields safely.
  public String getName() {
    return name;
  }

  public String getStudentId() {
    return studentId;
  }

  public String getDepartment() {
    return department;
  }

  // "Setters" — let other code *change* the private fields safely.
  public void setName(String name) {
    this.name = name;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  // A simple method that prints all info about this student.
  // "void" means it doesn't give any value back — it just does something.
  public void displayInfo() {
    System.out.println("    Student Name: " + name);
    System.out.println("    Student ID:   " + studentId);
    System.out.println("    Department:   " + department);
  }
}

// -------- Department class --------
// A Department has a friendly name (like "Computer Science & Engineering")
// and a short code (like "CSE").
class Department {

  private String name;
  private String code;

  // Constructor: runs when we do "new Department(...)".
  public Department(String name, String code) {
    this.name = name;
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  // Prints this department's info.
  public void displayInfo() {
    System.out.println("  Department Name: " + name);
    System.out.println("  Department Code: " + code);
  }
}

// -------- University class --------
// A University has a name and (in our simple example) two departments.
// This shows "composition": a University *contains* Department objects.
class University {

  private String name;
  private Department dept1; // holds a reference to a Department object
  private Department dept2;

  // Constructor: takes the university name and the two departments.
  public University(String name, Department dept1, Department dept2) {
    this.name = name;
    this.dept1 = dept1;
    this.dept2 = dept2;
  }

  // Prints a short summary of the university and the names of its departments.
  public void displayInfo() {
    System.out.println("University Name: " + name);
    System.out.println("Departments:");
    System.out.println("  - " + dept1.getName());
    System.out.println("  - " + dept2.getName());
  }

  // Prints full details for *both* departments.
  public void displayAllDepartments() {
    System.out.println("--- Department Details ---");
    dept1.displayInfo();
    System.out.println();
    dept2.displayInfo();
  }
}

// -------- Main class --------
// This is the entry point. Java looks for "public static void main" and starts here.
public class Main {

  public static void main(String[] args) {

    // Step 1: build two Department objects.
    // "new Department(...)" calls the Department's constructor.
    Department cse = new Department("Computer Science & Engineering", "CSE");
    Department eee = new Department("Electrical & Electronic Engineering", "EEE");

    // Step 2: build one University, passing in the two departments.
    University diu = new University("Daffodil International University", cse, eee);

    // Step 3: build two Student objects.
    Student s1 = new Student("Abdullah Alif", "252-15-834", "CSE");
    Student s2 = new Student("Bob", "221-15-002", "EEE");

    // Step 4: print everything. Each section calls a method on the object.

    System.out.println("=== University Info ===");
    diu.displayInfo();
    System.out.println();

    System.out.println("=== Department Details ===");
    diu.displayAllDepartments();
    System.out.println();

    System.out.println("=== Student Info ===");
    s1.displayInfo();
    System.out.println();
    s2.displayInfo();
  }
}
