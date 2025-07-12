import java.util.Scanner;

public class d_function {

    public static String myName(String name) {
        System.out.println(name);
        return name;
    }

    public static int calculate(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static void printFactorial(int n){
        if(n < 0){
            System.out.println("Invalid number");
            return;
        }

        int factorial = 1;
        for(int i = n; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return; // in void no need for return
    }

    public static void main(String[] args) {

        // String name = "anuj";
        // myName(name);

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = calculate(a, b);
        // System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);


        sc.close();

        
    }
}
