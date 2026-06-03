package loops;

import java.util.Scanner;

public class whileDoWhile {
    static void main() {
//Nel ciclo WHILE, come prima cosa viene VALUTATA LA CONDIZIONE (BOOLEANA)
//se è FALSA: allora non si entra proprio
//se è VERA: si entra nel loop
//se la variabile all'interno della condizione non cambia mai di valore --> CICLO INFINITO

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi un numero");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Dammi un'altro numero");
        int y = Integer.parseInt(scanner.nextLine());
        while (y <= x + 50) {
            x++;
            y += 5;
            System.out.println(y);
        }
        int number;
        int sum = 0;
        while (true) {
            System.out.println("Inserisci un numero (0 per uscire)");
            number = scanner.nextInt();
            if (number == 0) break; // con il break il while si interrompe quando la richiesta dell'if viene rispettata
            sum += number;
        }
        System.out.println(sum);

       
// ------------------------BREAK & CONTINUE-------------
        for (int i = 0; i < 1000; i++) {
            if (i == 100) break; // il break interrompe il ciclo ed esce
            System.out.println(i);

        }
        for (int i = 0; i < 1000; i++) {
            if (i == 100)
                continue; // il continue manda avanti il loop e fa saltare tutti i comandi dopo la condizione e porta avanti il loop
            System.out.println(i);

        }
    }

}
