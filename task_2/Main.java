
//used formatter and cleaned it. 


class Student {
    private String name;
    private String studentId;
    private String department;

    public Student(String name, String studentId, String department) {
        this.name = name;
        this.studentId = studentId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("    Student Name: " + name);
        System.out.println("    Student ID:   " + studentId);
        System.out.println("    Department:   " + department);
    }
}

class Department {
    private String name;
    private String code;

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

    public void displayInfo() {
        System.out.println("  Department Name: " + name);
        System.out.println("  Department Code: " + code);
    }
}

class University {
    private String name;
    private Department dept1;
    private Department dept2;

    public University(String name, Department dept1, Department dept2) {
        this.name = name;
        this.dept1 = dept1;
        this.dept2 = dept2;
    }

    public void displayInfo() {
        System.out.println("University Name: " + name);
        System.out.println("Departments:");
        System.out.println("  - " + dept1.getName());
        System.out.println("  - " + dept2.getName());
    }

    public void displayAllDepartments() {
        System.out.println("--- Department Details ---");
        dept1.displayInfo();
        System.out.println();
        dept2.displayInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        Department cse = new Department("Computer Science & Engineering", "CSE");
        Department eee = new Department("Electrical & Electronic Engineering", "EEE");

        University diu = new University("Daffodil International University", cse, eee);

        Student s1 = new Student("Abdullah Alif", "252-15-834", "CSE");
        Student s2 = new Student("Bob", "221-15-002", "EEE");

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