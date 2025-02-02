
import java.util.Scanner;

public class BasicCalculations {
    
    private static double add(double a, double b) {
        return a + b;
    }
    
    private static double subtract(double a, double b) {
        return a - b;
    }
    
    private static double multiply(double a, double b) {
        return a * b;
    }
    
    private static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
    
    private static double performCalculation(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return add(num1, num2);
            case '-':
                return subtract(num1, num2);
            case '*':
                return multiply(num1, num2);
            case '/':
                return divide(num1, num2);
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                return 0;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = performCalculation(num1, num2, operator);
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
