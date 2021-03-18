package vaccination;

import java.util.Scanner;

public class UserInterface {

    public static String AskForString(String question) {

        Scanner sc = new Scanner(System.in);
        System.out.print(question + " ");
        String answer = sc.nextLine();
        return answer;
    }

    public static String AskForDate() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date [DD:MM:YY]: ");
        String date = sc.nextLine();
        return date;
    }

    public static int AskForNumber(String question) {

        int answer = -1;
        Scanner sc = new Scanner(System.in);
        while (answer == -1) {
            try {
                System.out.print(question + " ");
                answer = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer.");
                System.out.println();
            }
        }
        return answer;
    }

    public static void SaySomething(String info) {
        System.out.println(info);
    }
}
