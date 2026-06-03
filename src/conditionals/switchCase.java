package conditionals;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());

        switch (score) {
            case 100: {
                System.out.println("Voto massimo");
                break;
            }
            case 90: {
                System.out.println("Molto bene");
                break;
            }
            case 80: {
                System.out.println("Buono");
                break;
            }
            default: {
                System.out.println("Riprova");
                break;
            }
        }
// Versione più compatta e moderna dello switch case
        int scoring = Integer.parseInt(scanner.nextLine());
        switch (scoring) {
            case 100 -> System.out.println("Brav*!");
            case 90 -> System.out.println("Ottimo");
            case 80 -> System.out.println("Buono");
            default -> System.out.println("Riprova");

        }

    }
}
