import java.util.Scanner;

public class c_loop {
    
    public static void main(String[] args) {

// for loop

        // for(int counter = 0; counter < 5; counter = counter + 1) {
        //     System.out.println("hello world");
        // }

        // for (int counter = 1; counter < 11; counter = counter + 1) {
        //     int a = 2;
        //     int table = a * counter;
        //     System.out.println(a + "*" + counter + "=" + table);
        // }


// while loop

        // int i = 0;
        // while ( i < 11){
        //     System.out.println(i);
        //     i = i + 1; // i++
        // }


// do while loop  { print atleast one time }

        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i < 11);

        // int j = 12;
        // do{
        //     System.out.println(j);
        //     j++;
        // }while(j < 11);


// practice 
        // to find sum of first natural no.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int j = 0;
        for(int i = 0; i <= n; i = i+1){
            j = j + i;
        }
        System.out.println(j);

        sc.close();
                        
    }
}
