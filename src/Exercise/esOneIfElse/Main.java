package Exercise.esOneIfElse;

public class Main {
    static void main() {

        pariDispari("Ciao, io mi chiamo Gigi!");
        bisestile(2064);

    }

    public static boolean pariDispari(String phrase) {
        if (phrase.length() % 2 == 0) {
            System.out.println("frase con lettere pari!");
            return true;
        } else {
            System.out.println("frase con lettere dispari!");
            return false;
        }

    }

    public static boolean bisestile(int year) {
        if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
            System.out.println("L'anno è bisestile");
            return true;
        } else {
            System.out.println("L'anno è normale");
            return false;
        }
    }

}
