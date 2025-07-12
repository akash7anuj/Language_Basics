// find all possible solution 
// and use one you want ...
import java.util.*;

public class l_Back_Traking {
    
//1 total no. of combination of ABC with uniqueness

    // public static void permutation(String str, String perm, int idx){
    //     if(str.length() == 0){
    //         System.out.println(perm);
    //         return;
    //     }

    //     for (int i = 0; i < str.length(); i++) {
    //         char currChar = str.charAt(i);
    //         String newstr = str.substring(0, i) + str.substring(i+1);

    //         permutation(newstr, perm + currChar, idx+1);
    //     }
    // }
    // public static void main(String[] args) {
        
    //     String str = "ABC";

    //     permutation(str, "", 0);


    // }


// 4 Queen placed at there position to not cancel each other

    public boolean isSafe(int row, int col, char[][] board) {
        // Check horizontally
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Check vertically
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check upper right diagonal
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check lower left diagonal
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check lower right diagonal
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';  // Backtrack
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }


    // Add the main method here
    public static void main(String[] args) {
        l_Back_Traking solution = new l_Back_Traking();
        int n = 4; // For 4-queens problem
        List<List<String>> results = solution.solveNQueens(n);

        for (List<String> board : results) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}



