public class TicTacToe {
    private Board board;
    private Player currentPlayer;
    private InputManager inputManager;
    private Verification verification;

    public TicTacToe() {
        board = new Board();
        verification = new Verification(board);
        inputManager = new InputManager();
        currentPlayer = new Player('X'); // Start with player X
    }

    public void play() {
        board.drawBoard();

        while (true) {
            int[] move = inputManager.getPlayerMove(currentPlayer);
            if (verification.validateInput(move[0], move[1])) {
                board.updateBoard(move[0], move[1], currentPlayer.getSymbol());
                board.drawBoard();

                if (verification.isWinner()) {
                    System.out.println("¡Jugador " + currentPlayer.getSymbol() + " gana!");
                    break;
                }

                if (verification.isBoardFull()) {
                    System.out.println("¡Empate!");
                    break;
                }

                currentPlayer.switchPlayer(); // Switch to the next player
            } else {
                System.out.println("Movimiento inválido. Intenta de nuevo.");
            }
        }
    }
}
