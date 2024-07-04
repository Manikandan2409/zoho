package MediumLevel;
import java.util.Scanner;

public class Exercise2 {

    private  char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    private  char currentPlayer = 'X';

    public static void main(String[] args) {
        Exercise2 tictactoe = new Exercise2();
        tictactoe.displayBoard();

        while (true) {
            tictactoe.playerMove();
            tictactoe.displayBoard();

            if (tictactoe.checkWin() || tictactoe.checkTie()) {
                break;
            }

            tictactoe.switchPlayer();
        }
    }

    private  void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private  void playerMove() {
        Scanner in = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column, e.g., 1 2): ");
            row = in.nextInt() - 1;
            col = in.nextInt() - 1;

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private  boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    private  void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private  boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                System.out.println("Player " + currentPlayer + " wins!");
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                System.out.println("Player " + currentPlayer + " wins!");
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            System.out.println("Player " + currentPlayer + " wins!");
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            System.out.println("Player " + currentPlayer + " wins!");
            return true;
        }

        return false;
    }

    private  boolean checkTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; 
                }
            }
        }
        System.out.println("The game is a tie!");
        return true;
    }
}


