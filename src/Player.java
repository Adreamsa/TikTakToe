public class Player {
    private char symbol;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    // Cambia el símbolo del jugador
    public void switchPlayer() {
        symbol = (symbol == 'X') ? 'O' : 'X';
    }
}
