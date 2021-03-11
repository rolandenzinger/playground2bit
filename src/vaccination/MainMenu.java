package vaccination;

import java.util.Scanner;

public class MainMenu {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int userInput = 0;
        System.out.println("Geben Sie (1) für Standortverwalung ein.");
        System.out.println("Geben Sie (2) ein um das Impf-Zeitfenster zu sehen.");
        System.out.println("Geben Sie (3) für Terminvergabe ein.");
        System.out.println("Geben Sie (4) für Personenverwaltung ein.");
        System.out.println("Geben Sie (5) um mehr Über diese Applikation zu erfahren.");
        System.out.println("Geben Sie (6) ein um das Prrogramm zu beenden");
        userInput = Integer.parseInt(sc.nextLine());
        MainMenu(userInput);
    }

    public static void MainMenu(int input) {


        switch (input) {
            case 1:
                output("1: Standortverwaltung");
            case 2:
                output("2: Imf-Zeitfenster");
            case 3:
                output("3: Terminvergabe");
            case 4:
                output("4: Personenverwaltung");
            case 5:
                output("5: Über diese Applikation");
            case 6:
                output("6: Beenden");

        }


    }

    public static void output(String out) {
        System.out.println(out);
    }

}
