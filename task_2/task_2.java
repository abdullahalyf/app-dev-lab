//used formatter and fixed few things by ai. 


class University {
  String name;

  public University(String name) { this.name = name; }

  public void showUniversityInfo() {
    System.out.println("University: " + name);
  }
}

class Department {
  String name;
  String code;

  public Department(String name, String code) {
    this.name = name;
    this.code = code;
  }

  public void showDepartmentInfo() {
    System.out.println("Department: " + name + " (" + code + ")");
  }
}

class Student {
  String name;
  String id;
  String department;

  public Student(String name, String id, String department) {
    this.name = name;
    this.id = id;
    this.department = department;
  }

  public void showStudentInfo() {
    System.out.println("Student Name: " + name);
    System.out.println("Student ID: " + id);
    System.out.println("Program: " + department);
  }
}

public class Main {
  public static void main(String[] args) {

    University myUni = new University("Daffodil International University");
    Department myDept = new Department("Computer Science & Engineering", "CSE");
    Student me = new Student("Abdullah Alif", "252-15-834", "CSE");

    System.out.println("--- Task 2 Output ---");
    myUni.showUniversityInfo();
    System.out.println();

    myDept.showDepartmentInfo();
    System.out.println();

    me.showStudentInfo();
  }
}