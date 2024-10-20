public class TicTacToe {
    private boolean rule = false;
    private Board board;
    public int tam = 3 ;
    private Player currentPlayer;
    private InputManager inputManager;
    private Verification verification;

    public TicTacToe(int tam, boolean rule) {
        this.rule = rule;
        this.tam = tam;
        board = new Board(tam);
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


                if (verification.isWinner(tam)) {
                    if (rule)
                        System.out.println("¡Jugador " + currentPlayer.getSymbol() + " gana!");
                    else
                        System.out.println("¡Jugador " + currentPlayer.getSymbol() + " pierde!");
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
