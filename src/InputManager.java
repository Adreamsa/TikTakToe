import java.util.Scanner;

public class InputManager {
    private Scanner scanner;

    public InputManager() {
        scanner = new Scanner(System.in);
    }

    public int[] getPlayerMove(Player player) {
        int row = -1;
        int col = -1;

        while (true) {
            System.out.print("Jugador " + player.getSymbol() + ", ingresa tu movimiento (fila y columna): ");

            String inputRow = scanner.next();
            String inputCol = scanner.next();

            // Validate that the input is a number using the regular expression
            if (!inputRow.matches("\\d+") || !inputCol.matches("\\d+")) {
                System.out.println("Entrada inválida. Debes ingresar números.");
                continue; // Repeat the cycle
            }

            row = Integer.parseInt(inputRow) - 1; // Subtract 1 to adjust to index 0
            col = Integer.parseInt(inputCol) - 1;

            return new int[] { row, col };
        }
    }
}
