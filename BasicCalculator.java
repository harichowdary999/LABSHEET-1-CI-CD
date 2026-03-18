import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1, num2, result;
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter numbers and the operator
        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();
        System.out.println("Choose an operator (+, -, *, /):");
        char operator = sc.next().charAt(0);

        // Perform calculation using a switch statement
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program if division by zero occurs
                }
                break;
            default:
                System.out.println("Invalid operator. Please choose a valid operation.");
        }

        // Close the scanner
        sc.close();
    }
}
