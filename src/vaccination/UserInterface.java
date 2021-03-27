package vaccination;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {

    public static String AskForString(String question) {

        Scanner sc = new Scanner(System.in);
        System.out.print(question + " ");
        String answer = sc.nextLine();
        return answer;
    }

    public static Date AskForDate(String info, String testOnlyDate) {

        Scanner sc = new Scanner(System.in);
        String dateAsString = "";

        if(info.length() > 0) {
            System.out.println(info);
        }

        if(testOnlyDate.length() > 0) {
            dateAsString = testOnlyDate;
        }
        else {
            System.out.print("Enter date [DD:MM:YY]: ");
            dateAsString = sc.nextLine();
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd:MM:yy");
        Date date = null;

        try {
            date = dateFormat.parse(dateAsString);
        } catch (ParseException e) {
            date = null;
            e.printStackTrace();
        }

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
