#include <stdio.h>

// Function declaration
int add(int a, int b);
void greet();
int factorial(int n);

int main() {
    // No arguments and no return value
    greet();

    // Arguments with return value
    int result = add(5, 3);
    printf("Sum: %d\n", result);

    // Recursion
    int fact = factorial(5);
    printf("Factorial: %d\n", fact);

    return 0;
}

// Function definitions
void greet() {
    printf("Hello, welcome to user-defined functions in C!\n");
}

int add(int a, int b) {
    return a + b;
}

int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}

