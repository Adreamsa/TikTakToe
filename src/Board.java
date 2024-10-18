public class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
        initializeBoard();
    }

    // Initializes the empty board
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Draw the board
    public void drawBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Updates the board with the player's movement.
    public void updateBoard(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Method to access the board
    public char[][] getBoard() {
        return board;
    }
}
