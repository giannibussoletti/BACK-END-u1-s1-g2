package Exercise.esTwoSwitch;

public class Main {

    static void main() {

    }

    public static String numToString(int num) {
        System.out.println("Dammi un numero con tre lettere da 1 a 9");
        String result = switch (num) {
            case 1 -> "uno";
            case 2 -> "due";
            case 3 -> "tre";
            case 6 -> "sei";
            default -> "Il numero contiene più di 3 lettere";

        };
        return result;
    }

}
