// ArithmeticOperations.java
// A beginner-friendly Java program that prints the four basic arithmetic operations.

public class ArithmeticOperations {

  public static void main(String[] args) {

    // Step 1: Declare two numbers we want to work with
    int a = 20;
    int b = 5;

    // Step 2: Perform the four basic arithmetic operations
    int sum = a + b; // addition
    int difference = a - b; // subtraction
    int product = a * b; // multiplication
    int quotient = a / b; // division

    // Step 3: Print the results
    System.out.println("--- Basic Arithmetic Operations ---");
    System.out.println("Numbers used: a = " + a + ", b = " + b);
    System.out.println("Addition:       " + a + " + " + b + " = " + sum);
    System.out.println("Subtraction:    " + a + " - " + b + " = " + difference);
    System.out.println("Multiplication: " + a + " * " + b + " = " + product);
    System.out.println("Division:       " + a + " / " + b + " = " + quotient);
  }
}
