class Calculator {
    public static double add(double x, double y) {
        // Add two numbers
        return x + y;
    }

    public static double subtract(double x, double y) {
        // Subtract y from x
        return x - y;
    }

    public static double multiply(double x, double y) {
        // Multiply two numbers
        return x * y;
    }

    public static String divide(double x, double y) {
        if (y != 0) {
            // Divide x by y, handle division by zero
            return Double.toString(x / y);
        } else {
            return "Error: Division by zero";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double x = 10;
        double y = 5;

        double resultAdd = calculator.add(x, y);
        double resultSubtract = calculator.subtract(x, y);
        double resultMultiply = calculator.multiply(x, y);
        String resultDivide = calculator.divide(x, y);

        System.out.println(x + " + " + y + " = " + resultAdd);
        System.out.println(x + " - " + y + " = " + resultSubtract);
        System.out.println(x + " * " + y + " = " + resultMultiply);
        System.out.println(x + " / " + y + " = " + resultDivide);
    }
}
