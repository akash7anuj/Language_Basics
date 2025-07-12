#include <stdio.h>
int main() {
    int a = 10, b = 20, max;
    max = (a > b) ? a : b;
    printf("The maximum value is %d\n", max);

    int x = 5, y = 3;
    printf("Bitwise AND: %d\n", x & y);
    printf("Bitwise OR: %d\n", x | y);

    return 0;
}

