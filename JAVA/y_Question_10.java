// Questions

// 1. Enter 3 numbers from the user & make a function to print their average.

// import java.util.Scanner;

// public class Question {

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         int average = (a+b+c) / 3 ;

//         System.out.println(average);

//         sc.close();
//     }
// }


// 2. Write a function to print the sum of all odd numbers from 1 to n.

// import java.util.Scanner;
// public class Question {

//     public static void sumOdd(int n){
//         int sum = 0;

//         for(int i = 1; i <= n; i++){
//             if(i % 2 == 1){
//                 sum += i;    
//             }
//         }
//         System.out.println("this is sum of all odd from 1 to "+ n + " = " + sum);
//     }

//     public static void main(String[] args) {
      
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         sumOdd(n);    

//     }
// }


// 3. Write a function which takes in 2 numbers and returns the greater of those two.

// import java.util.Scanner;
// public class Question {

//     public static void greaterNo(int a, int b){
//         if(a > b){
//             System.out.println(a + " is greater");
//         }
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         greaterNo(a, b);
//     }
// }


// 4. Write a function that takes in the radius as input and returns the circumference of a circle.

// import java.util.Scanner;
// public class Question {

//     public static void circumference(int r){

//         double circ = (2 * r) * 3.14;

//         System.out.println(circ);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();

//         circumference(r);
        
//     }
// }


// 5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

// import java.util.Scanner;
// public class Question {
    
//     public static void eligible(int age){
//         if(age >= 18){
//             System.out.println("you can vote!");
//         }
//         else{
//             System.out.println("you can't vote! your age is low");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         eligible(age);

//     }
// }

// 6. Write an infinite loop using do while condition.

// public class Question {

//     public static void infiniteLoop(String infinite){
//         do{
//             System.out.println(infinite);
//         }
//         while(true);
//     }

//     public static void main(String[] args) {

//         String infinite = "anuj";

//         infiniteLoop(infinite);

//     }
// }


// 7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

// import java.util.Scanner;

// public class Question {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int positive = 0;
//         int negative = 0;
//         int zeroCount = 0;
//         boolean continueEntering = true;

//         while(continueEntering){
//             System.out.print("enter your no. ");
//             int number = sc.nextInt();

//             if(number > 0){
//                 positive++;
//             }
//             else if (number < 0){
//                 negative++;
//             }else{
//                 zeroCount++;
//             }

//             System.out.print("Do you want to enter next no. (yes/no) : ");
//             String response = sc.next();
//             if(response.equalsIgnoreCase("no")){
//                 continueEntering = false;
//             }
//         }

//         System.out.println("count of positive number : " + positive);
//         System.out.println("count of negative : " + negative);
//         System.out.println("count of Zero : " + zeroCount);

//         sc.close();
        
//     }
// }


// 8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

// import java.util.Scanner;

// public class Question {

//     public static void numberPower(double number, double power){

//         double result = Math.pow(number, power);
//         System.out.println(result);
//         return ;
//     }

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.print("enter number ");
//         int number = sc.nextInt();

//         System.out.print("enter power no. ");
//         int power = sc.nextInt();

//         numberPower(number, power);

//         sc.close();

//     }
// }


// 9. Write a function that calculates the Greatest Common Divisor of 2 numbers.

// import java.util.Scanner;

// public class Question {

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.print("enter first number : ");
//         int num1 = sc.nextInt();

//         System.out.print("enter second number : ");
//         int num2 = sc.nextInt();

//         int a = num1;
//         int b = num2;

//         while(b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
            
//         }
//         System.out.println("GCD of " + num1 + " and " + num2 + " is " + a);

//         sc.close();
//     }
// }



// 10 Write a program to print Fibonacci series of n terms where n is input by user:
// 0 1 1 2 3 5 8 13 21 .....
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it. 

import java.util.Scanner;

public class y_Question_10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number for Fibonacci series : ");
        int n = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        for(int i = 0; i < n; i++){
            int nextTern = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTern;

            System.out.println(nextTern + " ");

        }

        System.out.println();

        sc.close();

    }
}