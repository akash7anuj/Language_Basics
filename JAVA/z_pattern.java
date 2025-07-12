public class z_pattern {
    public static void main(String[] args) {
        
// print the * pattern

        // int n = 4;
        // int m = 5;

        // for(int i = 1; i <= n; i++){  // row  { outer loop }
        //     for(int j = 1; j <= m; j++){  // column  { inner loop }
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


// print pattern { boundary pattern }

        // int n = 4;
        // int m = 5;

        // for(int i = 1; i <= n; i++){  
        //     for(int j = 1; j <= m; j++){

        //         if(i == 1 || j == 1 || i == n || j == m ){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


// print half piramide

        int n = 4;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++ ){
            System.out.print("*");
            }
        System.out.println();
        }
        
// print piramide { inverse }

        // int m = 4;

        // for(int i = m; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //     System.out.print("*");
        //     }
        //     System.out.println();
        // }


// print half piramide from right side

        // int n = 4;

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //             System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //             System.out.print("*");
        //     }
        //     System.out.println();
        // }

// print half piramide of no. {inverse}

        // int n = 5;

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i+1; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }


// print floyd's triangle

        // int m = 5;
        // int number = 1;

        // for(int i = 1; i <= m; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(number + " ");
        //         number++;
        //     }
        //     System.out.println();
        // }


// print 0/1 triangle

        // int n = 5;

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){

        //         int sum = i + j;
        //         if(sum % 2 == 0){
        //             System.out.print("1"+" ");
        //         }
        //         else {
        //             System.out.print("0"+" ");
        //         }
        //     }
        //     System.out.println();
        // }


// print butterfly pattern

        // var m = 5;

        // for(int i = 1; i <= m; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*"+" ");
        //     }
        //     for(int j = 1; j <= 2 * (m - i); j++){
        //         System.out.print(" "+" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i = m; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*"+" ");
        //     }
        //     for(int j = 1; j <= 2 * (m - i); j++){
        //         System.out.print(" "+" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }


// print solid rhombus

        // int n = 5;

        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(" "+" ");
        //     }
        //     for(int k = 1; k <= n; k++){
        //         System.out.print("*"+" ");
        //     }

        //     System.out.println();
        // }


// print piramide of number

        // int n = 5;

        // for(int i = 1; i <= n; i++){
        //     for(int j = n; j >= i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(i+" ");
                
        //     }
        //     System.out.println();
        // }


// print palindromic pattern

        // int n = 5;

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" "+" ");
        //     }
        //     for(int j = i; j >= 1; j--){
        //         System.out.print(j+" ");
        //     }
        //     for(int j = 2; j <= i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
    

// print diamond shape

        // int n = 4;

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 0; j <= 2*(i-1); j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 0; j <= 2*(i-1); j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        
    }

}
    