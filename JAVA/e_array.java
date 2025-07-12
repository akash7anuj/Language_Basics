import java.util.Scanner;

public class e_array {
    
    public static void main(String[] args) {
        
    /*  int marks[] = new int[3];
        marks[0] = 98;
        marks[1] = 99;
        marks[2] = 96;

        for(int i = 0; i < 3; i++){
            System.out.println(marks[i]);
        } */

    /*    int mark[] = {87, 89, 90};

        for(int i = 0; i < 3; i++){
            System.out.println(mark[i]);
        } */


// take array and value as input

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];

        for(int i = 0; i < size; i++){
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i = 0; i < number.length; i++){
            if(number[i] == x){
                System.out.println("found at index " + i);
            }
    
        }

        sc.close();
    }

}

