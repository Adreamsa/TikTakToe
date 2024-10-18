public class Verification {
    Board board;

    public Verification(Board board) {
        this.board = board;
    }

    // Validate the movement
    public boolean validateInput(int row, int col) {
        return row >= 0 && row < board.respuesta && col >= 0 && col < board.respuesta && board.getBoard()[row][col] == '-';
    }

    //----------------------------------------------Iwanos--------------------------------------------------------------
    // Check if there is a winner
    boolean isWinner(int size) {
        // Check rows
        for (int i = 0; i < size; i++) {
            char player = board.getBoard()[i][0];
            if (player != '-' && allEqual(player, board.getBoard()[i])) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < size; i++) {
            char player = board.getBoard()[0][i];
            if (player != '-' && allEqual(player, getColumn(i))) {
                return true;
            }
        }

        // Check diagonals
        char player = board.getBoard()[0][0];
        if (player != '-' && allEqual(player, getDiagonal(true))) {
            return true;
        }

        player = board.getBoard()[0][size - 1];
        if (player != '-' && allEqual(player, getDiagonal(false))) {
            return true;
        }

        return false;
    }

    private boolean allEqual(char player, char[] line) {
        for (char cell : line) {
            if (cell != player) {
                return false;
            }
        }
        return true;
    }

    private char[] getColumn(int col) {
        char[] column = new char[board.getBoard().length];
        for (int i = 0; i < board.getBoard().length; i++) {
            column[i] = board.getBoard()[i][col];
        }
        return column;
    }

    private char[] getDiagonal(boolean mainDiagonal) {
        char[] diagonal = new char[board.getBoard().length];
        for (int i = 0; i < board.getBoard().length; i++) {
            diagonal[i] = mainDiagonal ? board.getBoard()[i][i] : board.getBoard()[i][board.getBoard().length - 1 - i];
        }
        return diagonal;
    }

    //----------------------------------------------------------------------------------------------------------------------
    // Check if the board is full
    public boolean isBoardFull() {
        for (int i = 0; i < board.respuesta; i++) {
            for (int j = 0; j < board.respuesta; j++) {
                if (board.getBoard()[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
