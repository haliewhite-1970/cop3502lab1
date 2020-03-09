import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Variables for operands
    double firstOperand;
    double secondOperand;

    // User input for operands
    System.out.println("Enter first operand: ");
    firstOperand = scanner.nextDouble();
    System.out.println("Enter second operand: ");
    secondOperand = scanner.nextDouble();

    double addDoubles = firstOperand + secondOperand;
    double subDoubles = firstOperand - secondOperand;
    double multDoubles = firstOperand * secondOperand;
    double divDoubles = firstOperand / secondOperand;

    // Calculator menu
    System.out.println("Calculator Menu");
    System.out.println("---------------");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");

    System.out.println("Which operation do you want to perform?");
    int userOutput;
    userOutput = scanner.nextInt();

    // If statements for user input from menu
    if (userOutput == 1) {
        System.out.print("The result of the operation is ");
        System.out.println(addDoubles + ". Goodbye!");
    }
    else if (userOutput == 2) {
        System.out.print("The result of the operation is ");
        System.out.println(subDoubles + ". Goodbye!");
    }
    else if (userOutput == 3) {
        System.out.print("The result of the operation is ");
        System.out.println(multDoubles + ". Goodbye!");
    }
    else if (userOutput == 4) {
        System.out.print("The result of the operation is ");
        System.out.println(divDoubles + ". Goodbye!");
    }
    // If user does not input 1 - 4, error message shows and terminates program
    else {
        System.out.println("Error: Invalid selection! Terminating program.");
    }



}
}
