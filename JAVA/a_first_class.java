import java.util.Scanner;

class a_first_class{
    public static void main(String args[]) {
        
    // String
        System.out.println("hello world");
        // for printing next line after one 
            // println
            // print
            // \n
            System.out.println("*\n**\n***\n****");

    // variables
        String name = "anuj kumar";
        // int age = 45;
        int a = 44;
        int b = 34;

        a = 40; // to replace the value of "a"
        name = "akash";
        System.out.println(name);

        int sum = a + b ;
        System.out.println(sum);

        int diff = a - b ;
        System.out.println(diff);

        int ans = (a * b) / (a - b);
        System.out.println(ans);

    // input
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        // nextline
        // nextint
        // nextfloat
        System.out.println(name1);

        sc.close();
    }
}