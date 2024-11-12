public class NQueens {
    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // isSafe function to check the right place to place
    public static boolean isSafetoPlace(char board[][], int row, int col) {
        // for vertically check = col remain same only row dec by 1
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // for LeftDiagonal = to check we have to move row = row-1 and col = col - 1
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // for RightDiagonal = we have to move row = row - 1 and col = col + 1
        for (int i = row - 1, j = col - 1; i >= 0 && j == board.length - 1; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // when no cases found return true
        return true;
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
            if (isSafetoPlace(board, row, j)) {
                // Place a queen at board[row][j]
                board[row][j] = 'Q';

                // Move to the next row to continue placing queens
                nQueens(board, row + 1);

                // Backtrack: remove the queen from board[row][j] after printing one board for
                // next
                // after printing it go back to that queen place and make it empty so next
                // configuration can apply
                // print kake return kaila ke badh backtrack hoke sab empty kadetai so ferse
                // nQueen fun apan kam kartain e repeat hoit rahtai jenaki 4 ta ways atai 2 X 2
                // board ke laagin so 4 ber ena hotai
                board[row][j] = 'X';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4; // let's take a 2x2 board for testing
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
