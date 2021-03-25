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
			UserInterface.SaySomething("Geben Sie (1) für Standortverwalung ein.");
			UserInterface.SaySomething("Geben Sie (2) ein um auf das Impf-Zeitfenster zuzugreifen.");
			UserInterface.SaySomething("Geben Sie (3) für Terminvergabe ein.");
			UserInterface.SaySomething("Geben Sie (4) für Personenverwaltung ein.");
			UserInterface.SaySomething("Geben Sie (5) um mehr Über diese Applikation zu erfahren.");
			UserInterface.SaySomething("Geben Sie (6) ein um das Programm zu beenden");
			userInput = Integer.parseInt(sc.nextLine());
			MainMenu(userInput);
		} catch (NumberFormatException e) {
			UserInterface.SaySomething("Bitte geben Sie eine Zahl ein.");
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
		UserInterface.SaySomething("Sie befinden sich im Untermenü 'Standortverwaltung'");
		UserInterface.SaySomething("Geben Sie (1) ein um einen neuen Standort hinzuzufügen");
		UserInterface.SaySomething("Geben Sie (2) ein um einen Standot zu löschen");
		UserInterface.SaySomething("Geben Sie (3)  ein um alle bereits vorhanden Standorte zu listen ");
		try {
			userInput = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			UserInterface.SaySomething("Bitte geben Sie eine Zahl ein.");
		}
		switch (userInput) {
			case 1:
				UserInterface.SaySomething("*Standort hinzugefügt*");
				break;
			case 2:
				UserInterface.SaySomething("*Standort gelöscht*");
				break;
			case 3:
				UserInterface.SaySomething("*Standorte!!!!! *");
				break;
			default:
				UserInterface.SaySomething("Falsche Nummer");
				break;
		}

	}

	public static void ImpfZeitfenster() {
		int userInput = 0;
		System.out.println("Sie befinden sich im Untermenü 'Impf-Zeitfenster'");
		System.out.println("Geben Sie (1) ein um ein Freies Impfenster anzulegen.");
		System.out.println("Geben Sie (2) um einpackage vaccination");
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



