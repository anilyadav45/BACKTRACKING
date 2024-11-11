public class NQueens {
    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void nQueens(char board[][], int row) {
        // Base case: if we've placed queens on all rows, print the board configuration
        if (board.length == row) {
            System.out.println("-------------------Board------------------------");
            printBoard(board);
            return;
        }
        
        // Recursive case: try placing a queen in each column of the current row
        for (int j = 0; j < board.length; j++) {
            // Place a queen at board[row][j]
            board[row][j] = 'Q';
            
            // Move to the next row to continue placing queens
            nQueens(board, row + 1);
            
            // Backtrack: remove the queen from board[row][j] after printing one board for next 
            //after printing it go back to that queen place and make it empty so next configuration can apply
            //print kake return kaila ke badh backtrack hoke sab empty kadetai so ferse nQueen fun apan kam kartain e repeat hoit rahtai jenaki 4 ta ways atai 2 X 2 board ke laagin so 4 ber ena hotai 
            board[row][j] = 'X';
        }
    }

    public static void main(String[] args) {
        int n = 2; // let's take a 2x2 board for testing
        char chessBox[][] = new char[n][n];

        // Initialize the chess board with 'X' to indicate empty spaces
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBox[i][j] = 'X';
            }
        }
        nQueens(chessBox, 0);
    }
}
