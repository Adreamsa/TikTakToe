public class Verificacion {
    private Board board;

    public Verificacion(Board board) {
        this.board = board;
    }

    // Valida si el movimiento es válido
    public boolean validateInput(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board.getBoard()[row][col] == '-';
    }

    // Verifica si hay un ganador
    public boolean isWinner() {
        char[][] b = board.getBoard();

        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((b[i][0] != '-' && b[i][0] == b[i][1] && b[i][1] == b[i][2]) || (b[0][i] != '-' && b[0][i] == b[1][i] && b[1][i] == b[2][i])) {
                return true;
            }
        }

        // Verificar diagonales
        if ((b[0][0] != '-' && b[0][0] == b[1][1] && b[1][1] == b[2][2]) || (b[0][2] != '-' && b[0][2] == b[1][1] && b[1][1] == b[2][0])) {
            return true;
        }

        return false;
    }

    // Verifica si el tablero está lleno
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.getBoard()[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
