public class Player {
    private char symbol;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    // Change the player symbol
    public void switchPlayer() {
        symbol = (symbol == 'X') ? 'O' : 'X';
    }
}
