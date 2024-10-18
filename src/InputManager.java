import java.util.Scanner;

public class InputManager {
    private Scanner scanner;

    public InputManager() {
        scanner = new Scanner(System.in);
    }

    public int[] getPlayerMove(Player player) {
        System.out.print("Jugador " + player.getSymbol() + ", ingresa tu movimiento (fila y columna): ");

        int row = scanner.nextInt() - 1; // Subtract 1 to adjust to index 0
        int col = scanner.nextInt() - 1;

        return new int[] { row, col };
    }
}
