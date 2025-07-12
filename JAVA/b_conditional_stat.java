import java.util.Scanner;

public class b_conditional_stat {

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if (age >= 18) {
//             System.out.println("Adult");
//         } else {
//             System.out.println("not adult");
//         }

//     }


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int num = sc.nextInt();

    //     int rem = num % 2;

    //     if (rem == 1) {
    //         System.out.println("it's odd");
    //     } else{
    //         System.out.println("it's even");
    //     }
    // }


    // public static void main(String[] args) {

    //     final Scanner sc = new Scanner(System.in);
    //     final int a = sc.nextInt();
    //     final int b = sc.nextInt();

    //     if (a == b ) {
    //         System.out.println("a is equal to b");            
    //     }
    //     else { if (a > b) {  
    //             System.out.println("a is greater than b");                
    //           }
    //         else{ if (a < b) {
    //                 System.out.println("a is less than b");
    //               }
    //         }
    //     }  

    //     // else if 
    //     if (a == b ) {
    //         System.out.println("a is equal to b");            
    //     }
    //     else if (a > b) {  
    //         System.out.println("a is greater than b");                
    //     }
    //     else if (a < b) {
    //         System.out.println("a is less than b");
    //     }
            
         
    // }

    // button option

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if (button == 1) {
        //     System.out.println("hello");
        // } 
        // else if (button == 2) {
        //     System.out.println("namste");
        // }
        // else if (button == 3) {
        //     System.out.println("hiii");
        // }
        // else {
        //     System.out.println("invalide input");
        // }


// swith option to use
        switch (button) {
            case 1: System.out.println("hello");
                break;
            case 2: System.out.println("namste");
                break;
            case 3: System.out.println("hiii");
                break;
            default: System.out.println("invalide input");
                break;
        }

        sc.close();
    }
}


