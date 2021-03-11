package vaccination;

public class Person {
	private static String[][] person;
	
	
	//gibt die personID zurück
	public static int addNewPerson(String firstName, String lastName, int socialSecurityNumber, String street, int ZIP, String City, String Country, String Birthday, int Telephone) {
		return 0;
	}
	
	//gibt false zurück, wenn das Löschen nicht erfolgreich war
	public static boolean deletePerson(int personID) {
		return false;
	}
	
	//gibt alle Personen in einem Array zurück
	public static String[][] listAllPersons() {
		return person;
	}
}
