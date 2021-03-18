package vaccination;

import java.util.Scanner;
//todo
//Alles mit ** Gehört eingebunden (Klassen von anderen)
//Alles System.out.print/println gehören mit der methode "saysomething" von Kopp ausgegeben.
//Rechtschreibprüfung
//Programm in Schleife setzen, beenden Funktion schreiben und in die Fuktion "Mainmenue" Einbinden
//Text für "ÜberApplikation" Entwickeln.
//Testen ob alles Funktioniert
//Spaß haben XD
//HI


public class MainMenu {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			int userInput = 0;
			System.out.println("Geben Sie (1) für Standortverwalung ein.");
			System.out.println("Geben Sie (2) ein um auf das Impf-Zeitfenster zuzugreifen.");
			System.out.println("Geben Sie (3) für Terminvergabe ein.");
			System.out.println("Geben Sie (4) für Personenverwaltung ein.");
			System.out.println("Geben Sie (5) um mehr Über diese Applikation zu erfahren.");
			System.out.println("Geben Sie (6) ein um das Programm zu beenden");
			userInput = Integer.parseInt(sc.nextLine());
			MainMenu(userInput);
		} catch (NumberFormatException e) {
			System.out.println("Bitte geben Sie eine Zahl ein.");
		}
	}

	public static void MainMenu(int input) {


		switch (input) {
			case 1:
				Standortverwaltung();
				break;
			case 2:
				ImpfZeitfenster();
				break;
			case 3:
				Terminvergabe();
				break;
			case 4:
				Personenverwaltung();
				break;
			case 5:
				Informationen();
				break;
			case 6:
				output("'Beenden'");
				break;
			default:
				output("Fehler: falsche Zahl");
				break;
		}


	}

	public static void output(String out) {
		System.out.println(out);
	}

	public static void Standortverwaltung() {
		int userInput = 0;
		System.out.println("Sie befinden sich im Untermenü 'Standortverwaltung'");
		System.out.println("Geben Sie (1) ein um einen neuen Standort hinzuzufügen");
		System.out.println("Geben Sie (2) ein um einen Standot zu löschen");
		System.out.println("Geben Sie (3)  ein um alle bereits vorhanden Standorte zu listen ");
		try {
			userInput = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Bitte geben Sie eine Zahl ein.");
		}
		switch (userInput) {
			case 1:
				System.out.println("*Standort hinzugefügt*");
				break;
			case 2:
				System.out.println("*Standort gelöscht*");
				break;
			case 3:
				System.out.println("*Standorte!!!!! *");
				break;
			default:
				System.out.println("Falsche Nummer");
				break;
		}

	}

	public static void ImpfZeitfenster() {
		int userInput = 0;
		System.out.println("Sie befinden sich im Untermenü 'Impf-Zeitfenster'");
		System.out.println("Geben Sie (1) ein um ein Freies Impfenster anzulegen.");
		System.out.println("Geben Sie (2) um einpackage vaccination;\n" +
				"\n" +
				"import java.util.Scanner;\n" +
				"//todo\n" +
				"//Alles mit ** Gehört eingebunden (Klassen von anderen)\n" +
				"//Alles System.out.print/println gehören mit der methode \"saysomething\" von Kopp ausgegeben.\n" +
				"//Rechtschreibprüfung\n" +
				"//Programm in Schleife setzen, beenden Funktion schreiben und in die Fuktion \"Mainmenue\" Einbinden\n" +
				"//Text für \"ÜberApplikation\" Entwickeln.\n" +
				"//Testen ob alles Funktioniert\n" +
				"//Spaß haben XD\n" +
				"\n" +
				"\n" +
				"public class MainMenu {\n" +
				"\n" +
				"    public static Scanner sc = new Scanner(System.in);\n" +
				"\n" +
				"    public static void main(String[] args) {\n" +
				"        try {\n" +
				"            int userInput = 0;\n" +
				"            System.out.println(\"Geben Sie (1) für Standortverwalung ein.\");\n" +
				"            System.out.println(\"Geben Sie (2) ein um auf das Impf-Zeitfenster zuzugreifen.\");\n" +
				"            System.out.println(\"Geben Sie (3) für Terminvergabe ein.\");\n" +
				"            System.out.println(\"Geben Sie (4) für Personenverwaltung ein.\");\n" +
				"            System.out.println(\"Geben Sie (5) um mehr Über diese Applikation zu erfahren.\");\n" +
				"            System.out.println(\"Geben Sie (6) ein um das Programm zu beenden\");\n" +
				"            userInput = Integer.parseInt(sc.nextLine());\n" +
				"            MainMenu(userInput);\n" +
				"        } catch (NumberFormatException e) {\n" +
				"            System.out.println(\"Bitte geben Sie eine Zahl ein.\");\n" +
				"        }\n" +
				"    }\n" +
				"\n" +
				"    public static void MainMenu(int input) {\n" +
				"\n" +
				"\n" +
				"        switch (input) {\n" +
				"            case 1:\n" +
				"                Standortverwaltung();\n" +
				"                break;\n" +
				"            case 2:\n" +
				"                ImpfZeitfenster();\n" +
				"                break;\n" +
				"            case 3:\n" +
				"                Terminvergabe();\n" +
				"                break;\n" +
				"            case 4:\n" +
				"                Personenverwaltung();\n" +
				"                break;\n" +
				"            case 5:\n" +
				"                Informationen();\n" +
				"                break;\n" +
				"            case 6:\n" +
				"                output(\"'Beenden'\");\n" +
				"                break;\n" +
				"            default:\n" +
				"                output(\"Fehler: falsche Zahl\");\n" +
				"                break;\n" +
				"        }\n" +
				"\n" +
				"\n" +
				"    }\n" +
				"\n" +
				"    public static void output(String out) {\n" +
				"        System.out.println(out);\n" +
				"    }\n" +
				"\n" +
				"    public static void Standortverwaltung() {\n" +
				"        int userInput = 0;\n" +
				"        System.out.println(\"Sie befinden sich im Untermenü 'Standortverwaltung'\");\n" +
				"        System.out.println(\"Geben Sie (1) ein um einen neuen Standort hinzuzufügen\");\n" +
				"        System.out.println(\"Geben Sie (2) ein um einen Standot zu löschen\");\n" +
				"        System.out.println(\"Geben Sie (3)  ein um alle bereits vorhanden Standorte zu listen \");\n" +
				"        try {\n" +
				"            userInput = Integer.parseInt(sc.nextLine());\n" +
				"        } catch (NumberFormatException e) {\n" +
				"            System.out.println(\"Bitte geben Sie eine Zahl ein.\");\n" +
				"        }\n" +
				"        switch (userInput) {\n" +
				"            case 1:\n" +
				"                System.out.println(\"*Standort hinzugefügt*\");\n" +
				"                break;\n" +
				"            case 2:\n" +
				"                System.out.println(\"*Standort gelöscht*\");\n" +
				"                break;\n" +
				"            case 3:\n" +
				"                System.out.println(\"*Standorte!!!!! *\");\n" +
				"                break;\n" +
				"            default:\n" +
				"                System.out.println(\"Falsche Nummer\");\n" +
				"                break;\n" +
				"        }\n" +
				"\n" +
				"    }\n" +
				"\n" +
				"    public static void ImpfZeitfenster() {\n" +
				"        int userInput = 0;\n" +
				"        System.out.println(\"Sie befinden sich im Untermenü 'Impf-Zeitfenster'\");\n" +
				"        System.out.println(\"Geben Sie (1) ein um ein Freies Impfenster anzulegen.\");\n" +
				"        System.out.println(\"Geben Sie (2) um ein ungebuchtes Impf-Zeitfenster zu löschen.\");\n" +
				"        try {\n" +
				"            userInput = Integer.parseInt(sc.nextLine());\n" +
				"        } catch (NumberFormatException e) {\n" +
				"            System.out.println(\"Bitte geben Sie eine Zahl ein.\");\n" +
				"        }\n" +
				"        switch (userInput) {\n" +
				"            case 1:\n" +
				"                System.out.println(\"*Freies Impf-Zeitfenster angelegt*\");\n" +
				"                break;\n" +
				"            case 2:\n" +
				"                System.out.println(\"*Ungebuchtes Impf-Zeitfenster gelöscht*\");\n" +
				"                break;\n" +
				"            default:\n" +
				"                System.out.println(\"Falsche Nummer\");\n" +
				"                break;\n" +
				"        }\n" +
				"\n" +
				"    }\n" +
				"\n" +
				"    public static void Terminvergabe() {\n" +
				"        int userInput = 0;\n" +
				"        System.out.println(\"Sie befinden sich im Untermenü 'Terminvergabe'\");\n" +
				"        System.out.println(\"Geben Sie (1) um freie Termine für Ihren Standort anzuzeigen.\");\n" +
				"        System.out.println(\"Geben Sie (2) um freie Termine für ein Datum anzuzeigen.\");\n" +
				"        System.out.println(\"Geben Sie (3) um freie Termine zu buchen.\");\n" +
				"        System.out.println(\"Geben Sie (4) um einen Gebuchten Termin zu löschen.\");\n" +
				"        try {\n" +
				"            userInput = Integer.parseInt(sc.nextLine());\n" +
				"        } catch (NumberFormatException e) {\n" +
				"            System.out.println(\"Bitte geben Sie eine Zahl ein.\");\n" +
				"        }\n" +
				"        switch (userInput) {\n" +
				"            case 1:\n" +
				"                System.out.println(\"*Termine für Standort*\");\n" +
				"                break;\n" +
				"            case 2:\n" +
				"                System.out.println(\"*Freie Termine für Datum*\");\n" +
				"                break;\n" +
				"            case 3:\n" +
				"                System.out.println(\"*Freier Termin gebucht!*\");\n" +
				"                break;\n" +
				"            case 4:\n" +
				"                System.out.println(\"*Gebuchter Termin gelöscht!\");\n" +
				"                break;\n" +
				"            default:\n" +
				"                System.out.println(\"Falsche Nummer\");\n" +
				"                break;\n" +
				"        }\n" +
				"\n" +
				"    }\n" +
				"\n" +
				"    public static void Personenverwaltung() {\n" +
				"        int userInput = 0;\n" +
				"        System.out.println(\"Sie befinden sich im Untermenü 'Personenverwaltung'\");\n" +
				"        System.out.println(\"Geben Sie (1) um eine neue Person anzulegen.\");\n" +
				"        System.out.println(\"Geben Sie (2) um eine Person zu löschen.\");\n" +
				"        System.out.println(\"Geben Sie (3 ein um Alle Personen zu listen)\");\n" +
				"\n" +
				"        try {\n" +
				"            userInput = Integer.parseInt(sc.nextLine());\n" +
				"        } catch (NumberFormatException e) {\n" +
				"            System.out.println(\"Bitte geben Sie eine Zahl ein.\");\n" +
				"        }\n" +
				"\n" +
				"        switch (userInput) {\n" +
				"            case 1:\n" +
				"                System.out.println(\"*Person angelegt!!*\");\n" +
				"                break;\n" +
				"            case 2:\n" +
				"                System.out.println(\"*Person gelöscht*\");\n" +
				"                break;\n" +
				"            case 3:\n" +
				"                System.out.println(\"*Alle Personen !!!!!*\");\n" +
				"            default:\n" +
				"                System.out.println(\"Falsche Nummer\");\n" +
				"                break;\n" +
				"        }\n" +
				"\n" +
				"    }\n" +
				"\n" +
				"    public static void Informationen() {\n" +
				"        System.out.println(\"Informationen!!!!!!!!!\");\n" +
				"    }\n" +
				"\n" +
				"\n" +
				"}\n" +
				"\n" +
				"\n ungebuchtes Impf-Zeitfenster zu löschen.");
		try {
			userInput = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Bitte geben Sie eine Zahl ein.");
		}
		switch (userInput) {
			case 1:
				System.out.println("*Freies Impf-Zeitfenster angelegt*");
				break;
			case 2:
				System.out.println("*Ungebuchtes Impf-Zeitfenster gelöscht*");
				break;
			default:
				System.out.println("Falsche Nummer");
				break;
		}

	}

	public static void Terminvergabe() {
		int userInput = 0;
		System.out.println("Sie befinden sich im Untermenü 'Terminvergabe'");
		System.out.println("Geben Sie (1) um freie Termine für Ihren Standort anzuzeigen.");
		System.out.println("Geben Sie (2) um freie Termine für ein Datum anzuzeigen.");
		System.out.println("Geben Sie (3) um freie Termine zu buchen.");
		System.out.println("Geben Sie (4) um einen Gebuchten Termin zu löschen.");
		try {
			userInput = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Bitte geben Sie eine Zahl ein.");
		}
		switch (userInput) {
			case 1:
				System.out.println("*Termine für Standort*");
				break;
			case 2:
				System.out.println("*Freie Termine für Datum*");
				break;
			case 3:
				System.out.println("*Freier Termin gebucht!*");
				break;
			case 4:
				System.out.println("*Gebuchter Termin gelöscht!");
				break;
			default:
				System.out.println("Falsche Nummer");
				break;
		}

	}

	public static void Personenverwaltung() {
		int userInput = 0;
		System.out.println("Sie befinden sich im Untermenü 'Personenverwaltung'");
		System.out.println("Geben Sie (1) um eine neue Person anzulegen.");
		System.out.println("Geben Sie (2) um eine Person zu löschen.");
		System.out.println("Geben Sie (3 ein um Alle Personen zu listen)");

		try {
			userInput = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Bitte geben Sie eine Zahl ein.");
		}

		switch (userInput) {
			case 1:
				System.out.println("*Person angelegt!!*");
				break;
			case 2:
				System.out.println("*Person gelöscht*");
				break;
			case 3:
				System.out.println("*Alle Personen !!!!!*");
			default:
				System.out.println("Falsche Nummer");
				break;
		}

	}

	public static void Informationen() {
		System.out.println("Informationen!!!!!!!!!");
	}


}



