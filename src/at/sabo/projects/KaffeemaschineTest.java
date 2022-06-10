package at.sabo.projects;

import java.util.Scanner;

public class KaffeemaschineTest {
    public static void main(String[] args) {
        int ml = 0;
        int min = 40;
        int max = 200;
        int watertank = 1000;
        int beansFull = 100;


        while (true) {
            Scanner coffeemachine = new Scanner(System.in);
            System.out.println("Bitte gewünschte Funktion auswählen, NUR NUMMERN EINGEBEN");
            System.out.println("1. Maschine einschalten");
            System.out.println("2. Wie viele ml wollen Sie?");
            System.out.println("3. Wie stark soll der Kaffee sein, 1-10?");
            System.out.println("4. Wasser nachfüllen");
            System.out.println("5. Bohnen nachfüllen");
            System.out.println("6. Kaffee rauslassen");
            System.out.println("7. Maschine ausschalten");


            int choice = coffeemachine.nextInt();
            System.out.println("Auswahl Nummer: " + choice);
            if (1 == choice) {
                System.out.println("Die Maschine wurde eingeschaltet!");
            } else if (2 == choice) {
                System.out.println("Wie viel ml Kaffee wollen Sie trinken??");
                int newML = coffeemachine.nextInt();
                System.out.println("Größe: " + newML + "ml");
                ml += newML;
                if (newML > max){
                    System.out.println("Es ist zuviel, das maximum liegt bei "  + max + " ml");
                } else if (newML < min){
                    System.out.println("Es ist zu wenig, das Minimum liegt bei" + min + "ml");
                }
                int newAmountWatertank = watertank - newML;
                System.out.println("Der neue Wasserstand liegt bei " + newAmountWatertank);
                break;

            } else if (3 == choice) {
                System.out.println("Wählen sie die Stärke des Kaffees, 1-10!");
                int newStrength = coffeemachine.nextInt();
                System.out.println("Sie haben die Stärke " + newStrength + " ausgewählt");
                if(newStrength > 10){
                    System.out.println("Diese Stärke ist nicht vorhanden, der Kaffee ist zu stark");
                } else if (newStrength < 1){
                    System.out.println("Der Kaffee ist zu schwach, Größe ist nicht vorhanden");
                }
                int newAmountBeans = beansFull - newStrength;
                System.out.println("Neuer Bohnenstand liegt bei " + newAmountBeans);

                break;
            } else if (4 == choice) {
                System.out.println("Wie viel Wasser wollen sie nachfüllen?");
                int newAmountWater = coffeemachine.nextInt();
                System.out.println("Es werden " + newAmountWater + " ml eingefüllt");
                if (newAmountWater+watertank > 1000){
                    System.out.println("Der Wassertank hat ein maximales Volumen von 1000ml");
                }
            } else if (5 == choice) {
                    System.out.println("Bohnen werden nun nachgefüllt");
                System.out.println("Bohnenstand ist wieder auf " + beansFull);
            } else if (6 == choice) {
                    System.out.println("Kaffee wird rausgelassen");
            } else if (7 == choice) {
                    System.out.println("Maschine wird ausgeschaltet");
                    break;
            }
            }
        }
    }

