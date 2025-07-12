public class l_sudoku {

    public boolean isSafe(char [][] board, int row, int col, int number){

        // row and column
        for (int i = 0; i < board.length; i++) {
            if(board[i][col] == (char) (number + '0') ){
                return false;
            }
            if(board[row][i] == (char) (number + '0') ){
                return false;
            }
        }

        // grid 

        int srow = (row/3) * 3;
        int scol = (col/3) * 3;

        for (int i = srow; i < srow +3; i++) {
            for (int j = scol; j < scol +3; j++) {
                if(board[i][j] == (char) (number + '0')){
                    return false;
                }
            }
        }

        return true;
    } 

    public boolean helper(char [][] board, int row, int col){
        if(row == board.length){
            return true;
        }

        int nRow = 0;
        int nCol = 0;

        if(col != board.length - 1){
            nRow = row;
            nCol = col + 1;
        }
        else{
            nRow = row + 1;
            nCol = 0;
        }

        if(board[row][col] == '.'){
            if(helper(board, nRow, nCol)){
                return true;
            }
            else{
                for (int i = 1; i <= 9; i++) {
                    if(isSafe(board, row, col, i)){
                        board[row][col] = (char) (i + '0');
                        if(helper(board, nRow, nCol)){
                            return true;
                        }
                        else{
                            board[row][col] = '.';
                        }
                    }
                    
                }
            }
        }

        return false;
    }
    
    public void solveSudoku(char [][] board){
        helper(board, 0, 0);

    }


    public static void main(String[] args) {
        l_sudoku solver = new l_sudoku();
        
        // Example Sudoku board; '.' represents empty cells
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '4'}
        };

        solver.solveSudoku(board);

        // Print the solved Sudoku board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
    

//**  same code for sudoku { by chatGPT }


// public class m_sudoku {

//     public boolean isSafe(char[][] board, int row, int col, int number) {
//         // Row and column check
//         for (int i = 0; i < board.length; i++) {
//             if (board[i][col] == (char) (number + '0')) {
//                 return false;
//             }
//             if (board[row][i] == (char) (number + '0')) {
//                 return false;
//             }
//         }

//         // Grid check
//         int srow = (row / 3) * 3;
//         int scol = (col / 3) * 3;

//         for (int i = srow; i < srow + 3; i++) {
//             for (int j = scol; j < scol + 3; j++) {
//                 if (board[i][j] == (char) (number + '0')) {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }

//     public boolean helper(char[][] board, int row, int col) {
//         // If we have filled all rows, solution found
//         if (row == board.length) {
//             return true;
//         }

//         int nRow = 0;
//         int nCol = 0;

//         // Calculate next row and column
//         if (col != board.length - 1) {
//             nRow = row;
//             nCol = col + 1;
//         } else {
//             nRow = row + 1;
//             nCol = 0;
//         }

//         // If the cell is already filled, move to the next cell
//         if (board[row][col] != '.') {
//             return helper(board, nRow, nCol);
//         }

//         // Try placing digits 1-9 in the empty cell
//         for (int i = 1; i <= 9; i++) {
//             if (isSafe(board, row, col, i)) {
//                 board[row][col] = (char) (i + '0');

//                 // Recursively attempt to solve from here
//                 if (helper(board, nRow, nCol)) {
//                     return true;
//                 }

//                 // Backtrack if placing the digit didn't lead to a solution
//                 board[row][col] = '.';
//             }
//         }

//         return false; // If no number can be placed, return false
//     }

//     public void solveSudoku(char[][] board) {
//         helper(board, 0, 0);
//     }

//     public static void main(String[] args) {
//         n_dskaj solver = new n_dskaj();
        
//         // Example Sudoku board; '.' represents empty cells
//         char[][] board = {
//             {'0', '3', '.', '.', '7', '.', '.', '.', '.'},
//             {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//             {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//             {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//             {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//             {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//             {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//             {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//             {'.', '.', '.', '.', '8', '.', '.', '7', '0'}
//         };

//         solver.solveSudoku(board);

//         // Print the solved Sudoku board
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board[0].length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
