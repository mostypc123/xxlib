#include <iostream>

class Calculator {
public:
    static double add(double x, double y) {
        return x + y;
    }

    static double subtract(double x, double y) {
        return x - y;
    }

    static double multiply(double x, double y) {
        return x * y;
    }

    static std::string divide(double x, double y) {
        if (y != 0) {
            return std::to_string(x / y);
        } else {
            return "Error: Division by zero";
        }
    }
};

int main() {
    double x = 10;
    double y = 5;

    double resultAdd = Calculator::add(x, y);
    double resultSubtract = Calculator::subtract(x, y);
    double resultMultiply = Calculator::multiply(x, y);
    std::string resultDivide = Calculator::divide(x, y);

    std::cout << x << " + " << y << " = " << resultAdd << std::endl;
    std::cout << x << " - " << y << " = " << resultSubtract << std::endl;
    std::cout << x << " * " << y << " = " << resultMultiply << std::endl;
    std::cout << x << " / " << y << " = " << resultDivide << std::endl;

    return 0;
}
