package conditionals;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
// Negli if Else bisogna ritornare sempre un valore booleano.
// Per avere un valore booleano in alcuni casi si usano i moduli, in questo caso
// isEmpty controlla se la stringa è vuota o meno
        if (input.isEmpty()) {
            System.out.println("La stringa è vuota");
        } else {
            System.out.println("La stringa non è vuota");
        }

// Ternary
        double totale = 50.0;
        double spedizione = totale >= 50.0 ? 0 : 5.99;
        System.out.println("Le spede di spedizione sono: " + spedizione);
    }
}
