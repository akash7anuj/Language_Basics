import math

def print_menu():
    print("Welcome to the Advanced Calculator")
    print("Available operations:")
    print("+  : Addition")
    print("-  : Subtraction")
    print("*  : Multiplication")
    print("/  : Division")
    print("** : Exponentiation")
    print("%  : Modulus")
    print("// : Floor Division")
    print("exit : Exit the calculator")

def perform_calculation(num1, num2, operation):
    if operation == '+':
        return num1 + num2
    elif operation == '-':
        return num1 - num2
    elif operation == '*':
        return num1 * num2
    elif operation == '/':
        if num2 != 0:
            return num1 / num2
        else:
            return "Error: Division by zero"
    elif operation == '**':
        return num1 ** num2
    elif operation == '%':
        return num1 % num2
    elif operation == '//':
        return num1 // num2
    else:
        return "Invalid operation"

def calculator():
    print_menu()
    history = []

    while True:
        try:
            num1 = float(input("Enter the first number: "))
            num2 = float(input("Enter the second number: "))
            operation = input("Enter operation (+, -, *, /, **, %, //) or 'exit' to quit: ").strip().lower()

            if operation == 'exit':
                print("Thanks for using the calculator.")
                break

            result = perform_calculation(num1, num2, operation)
            print(f"Result: {result}")
            history.append((num1, operation, num2, result))

        except ValueError:
            print("Invalid input. Please enter numeric values for numbers and a valid operation.")
            continue

        while True:
            again_cal = input("Do you want to calculate again? (yes/no): ").strip().lower()
            if again_cal == 'yes':
                break  # Exit the inner while loop and start a new calculation
            elif again_cal == 'no':
                print("Operation History:")
                for item in history:
                    print(f"{item[0]} {item[1]} {item[2]} = {item[3]}")
                print("Thanks for using the calculator.")
                return
            else:
                print("Please enter 'yes' or 'no'.")

if __name__ == "__main__":
    calculator()
