import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escoje tablero\n" +
                "1.- Tamaño 3x3\n" +
                "2.- Tamaño 4x4\n" +
                "Otro.- Cerrar");
        String inputTam = scanner.next();
        System.out.println("Deseas aplicar regla especial? \n" +
                "1.- Si\n" +
                "2.- No\n");
        String inputRule = scanner.next();
        int auxTam = verificationLetter(inputTam);
        boolean auxRule = verificationLetter(inputRule) != 1;
        TicTacToe game;
        switch (auxTam) {
            case 1:
                game = new TicTacToe(3, auxRule);
                game.play(); // The game begins
                break;
            case 2:
                game = new TicTacToe(4, auxRule);
                game.play(); // The game begins
                break;
            default:
                System.out.println("Adios");
        }
    }

    public static int verificationLetter(String input) {
        while (true) {
            // Validate that the input is a number using the regular expression
            if (!input.matches("\\d+")) {
                System.out.println("Entrada inválida. Debes ingresar números.");
                continue; // Repeat the cycle
            }
            return Integer.parseInt(input);
        }
    }
}
