package loops;

import java.util.Scanner;

public class forLoop {
    static void main() {
        // ---------------------FOR-----------------
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Inserisci un numero");
            numbers[i] = scanner.nextInt();

        }
// c'è una versione più compatta del for che è il Enhanced For
        for (int numeroFor : numbers) { // Questa versione è utile quando non abbiamo bisogno di accedere all'indice dell'elemento
            System.out.println(numeroFor);
        }
    }
}
