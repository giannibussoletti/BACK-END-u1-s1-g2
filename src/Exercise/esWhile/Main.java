package Exercise.esWhile;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Scrivi una frase (:q per uscire)");
            String stopPhrase = ":q";
            String phrase = scanner.nextLine();
            if (phrase.equals(stopPhrase)) {
                System.out.println("Programma terminato");
                break;
            } else {
                String[] characters = phrase.split("");
                System.out.println(Arrays.toString(characters));
            }
        }
    }
}
