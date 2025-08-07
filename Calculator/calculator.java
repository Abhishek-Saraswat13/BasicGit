import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = scanner.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number:");
        double b = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = Add.add(a, b);
                break;
            case '-':
                result = Subtract.subtract(a, b);
                break;
            case '*':
                result = Multiply.multiply(a, b);
                break;
            case '/':
                try {
                    result = Divide.divide(a, b);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();

        // ye Abhishek ne kiya hai
    }
}
