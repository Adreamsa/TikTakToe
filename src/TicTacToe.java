public class TicTacToe {
    private Board board;
    private Player currentPlayer;
    private InputManager inputManager;
    private Verificacion verificacion;

    public TicTacToe() {
        board = new Board();
        verificacion = new Verificacion(board);
        inputManager = new InputManager();
        currentPlayer = new Player('X'); // Comienza con el jugador X
    }

    public void play() {
        board.drawBoard();

        while (true) {
            int[] move = inputManager.getPlayerMove(currentPlayer);
            if (verificacion.validateInput(move[0], move[1])) {
                board.updateBoard(move[0], move[1], currentPlayer.getSymbol());
                board.drawBoard();

                if (verificacion.isWinner()) {
                    System.out.println("¡Jugador " + currentPlayer.getSymbol() + " gana!");
                    break;
                }

                if (verificacion.isBoardFull()) {
                    System.out.println("¡Empate!");
                    break;
                }

                currentPlayer.switchPlayer(); // Cambia al siguiente jugador
            } else {
                System.out.println("Movimiento inválido. Intenta de nuevo.");
            }
        }
    }
}
