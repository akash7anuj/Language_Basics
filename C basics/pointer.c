int globalVar = 10; // Global scope

void demo() {
    static int count = 0; // Static variable
    count++;
    printf("Count: %d\n", count);
}

