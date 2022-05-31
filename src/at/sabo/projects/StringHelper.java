package at.sabo.projects;

import java.util.Scanner;

public class StringHelper {
    public static void main(String[] args) {
        System.out.println("Hallo, wähle bitte eine Funktion aus!");
        System.out.println("1. Palindrom Überprüfung");
        System.out.println("2. Buchstaben zählen");
        System.out.println("3. Eingabe umdrehen");
        System.out.println("4. Anzahl der Buchstaben ausgeben");
        System.out.println("5. Ende");
        while (true){
            Scanner input = new Scanner(System.in);
            String random = input.nextLine();
            if (random.equals("1")){
                isPalindrom();
            }
            else if (random.equals("2")){
                countLetters('a');
            }
            else if(random.equals("3")){
                reverseString();
            }
            else if(random.equals("4")){
                getAmountOfLetters();
            }
            else if (random.equals("5")){
                System.out.println("Ende");
            break;
            }
            else{
                System.out.println("Keine Funktion");
            }

        }


    }
    public static void isPalindrom() {

        System.out.println("Welches Wort wollen Sie überprüfen?");
        Scanner input = new Scanner(System.in);
        String random = input.nextLine();
        String randomText = "";

        for (int i = random.length() - 1; i >= 0; i--) {
            randomText += random.charAt(i); // charAt(i) =gibt einen Wert vom Datentyp zurück, indemfall von i bzw. von der Länge von Random.

        }

        boolean isPalindrom = true;

        System.out.println(randomText);

        for (int i = 0; i < random.length(); i++) {

            if (random.charAt(i) == randomText.charAt(i)) {
                System.out.println("Dieses Wort ist ein Palindrom");
            }

            else {
                isPalindrom = false;
                System.out.println("Es ist kein Palindrom");
            }
        }
    }

    public static void countLetters(char check){
        System.out.println("Wollen Sie einen einzelnen Buchstaben filtern?");
        Scanner scanner = new Scanner(System.in);
        String  input = scanner.nextLine();

        int count = 0;
        char [] counter = input.toCharArray();
        for (int i = 0; i < counter.length; i++) {

            if (counter[i] == check){

                count += 1;

            }

        }
        System.out.println("count: " + count);






    }

    public static void reverseString(){
        System.out.println("Welches Wort wollen Sie umdrehen?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String inputText = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            inputText += input.charAt(i); // charAt(i) =gibt einen Wert vom Datentyp zurück, indemfall von i bzw. von der Länge von Random.

        }



    }
    public static void getAmountOfLetters(){



    }
}
