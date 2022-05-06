package at.sabo.projects;

import java.util.Random;
import java.util.Scanner;

public class dicegame {
    public static void main(String[] args) {
        System.out.println("Wie oft wollen sie würfeln?");
        Scanner input = new Scanner(System.in);
        int random = input.nextInt();

        Random ranNum = new Random();

        System.out.println("Sie haben die Zahl : ");
        int number = 0;
        int randomNumber = 0;
        int numberCom = 0;
        int randomNumberCom = 0;

        for (int i = 0; i < random; i++) {
            randomNumber = ranNum.nextInt(6) + 1;
            number = number + randomNumber;
            System.out.println(randomNumber);
            System.out.println(" ");
        }
        System.out.println("");
        System.out.println("Summe der Zahlen Spieler: " + number);


        for (int i = 0; i < random; i++) {
            randomNumberCom = ranNum.nextInt(6) + 1;
            numberCom = numberCom + randomNumberCom;
            System.out.println(randomNumberCom);
            System.out.println(" ");
        }
        System.out.println("");
        System.out.println("Summe der Zahlen Computer: " + numberCom);

        if (number < numberCom){
            System.out.println("Spieler hat gewonnen");
        }
        else if (number > numberCom){
            System.out.println("Computer hat gewonnen");
        }






    }
}





