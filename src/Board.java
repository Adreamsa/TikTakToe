public class Board {
    private char[][] board;
    public int respuesta;

    public Board(int respuesta) {
        this.respuesta = respuesta;
        board = new char[respuesta][respuesta];
        initializeBoard();
    }

    // Initializes the empty board
    public void initializeBoard() {
        for (int i = 0; i < respuesta; i++) {
            for (int j = 0; j < respuesta; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Draw the board
    public void drawBoard() {
        System.out.println("-------------");
        for (int i = 0; i < respuesta; i++) {
            System.out.print("| ");
            for (int j = 0; j < respuesta; j++) {
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
