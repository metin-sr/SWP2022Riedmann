package at.sabo.projects;

import java.util.Scanner;

public class Caesar {

    private static int schieben;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Was wollen Sie verschlüsseln?");
        String locked = scanner.nextLine();
        System.out.println("Um wie viele stellen soll verschoben werden?");

        int shift = scanner.nextInt();


        if (shift >= 1 && shift < 127) {
            char[] word = locked.toCharArray();
            char[] newWord = crypt(shift, word);


            System.out.println("\n Verschlüsselter Text:");

            for (int i = 0; i < newWord.length; i++) {

                System.out.println(newWord[i]);

            }
            System.out.println("\n");
            System.out.println("Wollen sie das Wort wieder entschlüsseln?");
            System.out.println("Falls ja, geben sie die eins ein, falls nicht dann die zwei");


            int scan = scanner.nextInt();

            if (scan == 1) {
                char[] cryptback = cryptback(schieben, newWord);
                System.out.println("Verschlüsseltes Wort war: ");
                for (int i = 0; i < cryptback.length; i++) {
                    System.out.println(cryptback[i]);

                }
            } else {
                System.out.println("Programmende");
            }
        } else {
            System.out.println("maximale Verschiebung sind 127 Stellen");
        }

    }

    public static char[] crypt(int offset, char[] charArray) {

        char[] cryptArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            int schieben = (charArray[i] + offset);

            cryptArray[i] = (char) (schieben);
        }
        return cryptArray;
    }

    public static char[] cryptback(int offset, char[] charArray) {
        char[] cryptback = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            int schieben = (charArray[i] - offset);
            cryptback[i] = (char) (schieben);
        }
        return (cryptback);
    }
}
