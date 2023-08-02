class Calculator:
    @staticmethod
    def add(x, y):
        # Add two numbers
        return x + y

    @staticmethod
    def subtract(x, y):
        # Subtract y from x
        return x - y

    @staticmethod
    def multiply(x, y):
        # Multiply two numbers
        return x * y

    @staticmethod
    def divide(x, y):
        if y != 0:
            # Divide x by y, handle division by zero
            return x / y
        else:
            return "Error: Division by zero"

# Example usage of the calculator:
calculator = Calculator()

x = 10
y = 5

result_add = calculator.add(x, y)
result_subtract = calculator.subtract(x, y)
result_multiply = calculator.multiply(x, y)
result_divide = calculator.divide(x, y)

print(f"{x} + {y} = {result_add}")
print(f"{x} - {y} = {result_subtract}")
print(f"{x} * {y} = {result_multiply}")
print(f"{x} / {y} = {result_divide}")
