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
        int count = 1;
        // step -3 : base casae
        if (board.length == row) {
            System.out.println("-------------------Board------------------------");
            printBoard(board); // this will print each board one time after each row queen is placed
            return;
        }
        // step -2 : to find only ways of keeping queen to each colum but for 1 row in 1
        // col only
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q'; // here we are assigining queen for each row one time
            nQueens(board, row + 1); // for next row recursively it will be called
            board[row][j] = 'X'; // after filling the queen rest should be empty but for now it's X for sign
        }
    }

    public static void main(String[] args) {
        int n = 2; // let's take 2*2 box
        char chessBox[][] = new char[n][n];

        // step-1 : To initialize chess
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBox[i][j] = 'X';
            }
        }
        nQueens(chessBox, 0);
    }
}
