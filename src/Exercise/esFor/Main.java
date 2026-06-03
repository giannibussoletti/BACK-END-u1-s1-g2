package Exercise.esFor;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fai iniziare il countdown con un numero da 1 a 20");
        int countdown = Integer.parseInt(scanner.nextLine());
        if (countdown > 21) {
            countdown = 21;
        }

        countdownMethod(countdown);

    }

    public static void countdownMethod(int num) {
        for (int i = 21; i > 0; i--) {
            num--;
            if (num == 10) {
                System.out.println("[OK] " + num);
                System.out.println("--SEPARAZIONE STADIO--");
            } else if (num == 0) {
                System.out.println("--\uD83D\uDE80 IGNITION--");

            } else if (num % 2 == 0) {
                System.out.println("[OK] " + num);

            } else {
                System.out.println("[CHECK] " + num);
            }

        }
    }
}
