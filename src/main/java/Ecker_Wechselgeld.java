import java.util.Scanner;

public class Ecker_Wechselgeld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int EINEUR = 100;
        final int FUENFZIGCENT = 50;
        final int ZWANZIGCENT = 20;
        final int ZEHNCENT = 10;
        final int FUENFCENT = 5;
        final int ZWEICENT = 2;
        final int EINCENT = 1;
        int eineur;
        int fuenfzigcent;
        int zwanzigcent;
        int zehncent;
        int fuenfcent;
        int zweicent;
        int eincent;
        int eingabe;
        int rest1;
        int rest2;
        int rest3;
        int rest4;
        int rest5;
        int rest6;
        int rest7;

        System.out.print("Geben sie bitte einen Betrag ein (zwischen 0 und 100 Cent): ");
        eingabe = scanner.nextInt();

        eineur = eingabe / EINEUR;
        rest1 = eingabe % EINEUR;

        fuenfzigcent = rest1 / FUENFZIGCENT;
        rest2 = rest1 % FUENFZIGCENT;

        zwanzigcent = rest2 / ZWANZIGCENT;
        rest3 = rest2 % ZWANZIGCENT;

        zehncent = rest3 / ZEHNCENT;
        rest4 = rest3 % ZEHNCENT;

        fuenfcent = rest4 / FUENFCENT;
        rest5 = rest4 % FUENFCENT;

        zweicent = rest5 / ZWEICENT;
        rest6 = rest5 % ZWEICENT;

        eincent = rest6 / EINCENT;
        rest7 = rest6 % EINCENT;

        System.out.println("Anzahl der  1 Euro - Münzen : " + eineur);
        System.out.println("Anzahl der 50 Cent - Münzen : " + fuenfzigcent);
        System.out.println("Anzahl der 20 Cent - Münzen : " + zwanzigcent);
        System.out.println("Anzahl der 10 Cent - Münzen : " + zehncent);
        System.out.println("Anzahl der  5 Cent - Münzen : " + fuenfcent);
        System.out.println("Anzahl der  2 Cent - Münzen : " + zweicent);
        System.out.println("Anzahl der  1 Cent - Münzen : " + eincent);








    }
}
