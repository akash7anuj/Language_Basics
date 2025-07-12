#  temprature converter


def celsius_to_fahrenheit(celsius):
    return (celsius * 9/5) + 32

def fahrenheit_to_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9

def main():
    choice = input("Choose conversion (1: Celsius to Fahrenheit, 2: Fahrenheit to Celsius): ")
    if choice == '1':
        celsius = float(input("Enter temperature in Celsius: "))
        print(f"Temperature in Fahrenheit: {celsius_to_fahrenheit(celsius)}")
    elif choice == '2':
        fahrenheit = float(input("Enter temperature in Fahrenheit: "))
        print(f"Temperature in Celsius: {fahrenheit_to_celsius(fahrenheit)}")
    else:
        print("Invalid choice")

main()

