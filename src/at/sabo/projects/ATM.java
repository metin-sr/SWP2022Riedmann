package at.sabo.projects;

import java.util.Scanner;


public class ATM {
    public static void main(String[] args) {
        int balance = 0;

        while (true) {
            Scanner cashscan = new Scanner(System.in);
            System.out.println("Bitte gewünschte Funktion auswählen, NUR NUMMERN EINGEBEN");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");

            int choice = cashscan.nextInt();
            System.out.println("Auswahl Nummer: " + choice);
            if (1 == choice) {
                System.out.println("Wie viel wollen sie Einzahlen?");
                int newAmount = cashscan.nextInt();
                System.out.println("Summe: " + newAmount);
                balance += newAmount;
            } else if (2 == choice) {
                System.out.println("Wie viel wollen sie Abheben?");
                int newOutGive = cashscan.nextInt();
                if (balance < newOutGive) {
                    System.out.println("Zu wenig Geld auf dem Konto");
                } else if (balance == newOutGive) {
                    System.out.println("Summe " + newOutGive);
                    balance -= newOutGive;
                }
            } else if (3 == choice) {
                System.out.println(balance);
            } else if (4 == choice) {
                System.out.println("Wiedersehen");
                break;
            }
        }
    }
}
