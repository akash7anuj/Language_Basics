import java.util.Scanner;

public class f_array_2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row ");
        int row = sc.nextInt();
        System.out.print("col ");
        int col = sc.nextInt();

        int [][] number = new int[row][col];

        for(int i = 0; i < row ; i++){
            for(int j = 0; j < col; j++){
                number[i][j] = sc.nextInt();
            }
        }

// this is for print location of matrix 

        System.out.print("no. for find ");
        int x = sc.nextInt();

        for(int i = 0; i < row ; i++){
            for(int j = 0; j < col; j++){
                if(number[i][j] == x){
                    System.out.println("x found at location (" + i + " , " + j + ")");
                }
            }
        }



// this is for print row and column in matrix

        // for(int i = 0; i < row ; i++){
        //     for(int j = 0; j < col; j++){
        //         System.out.print(number[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        sc.close();
    }
    
}
