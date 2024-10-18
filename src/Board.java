public class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
        initializeBoard();
    }

    // Inicializa el tablero vacío
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Dibuja el tablero en la consola
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

    // Actualiza el tablero con el movimiento del jugador
    public void updateBoard(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Método para acceder al tablero
    public char[][] getBoard() {
        return board;
    }
}
