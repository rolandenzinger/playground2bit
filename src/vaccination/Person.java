package vaccination;

public class Person {
	private static String[][] person;
	
	
	//gibt die personID zur�ck
	public static int addNewPerson(String firstName, String lastName, int socialSecurityNumber, String street, int ZIP, String City, String Country, String Birthday, int Telephone) {
		return 0;
	}
	
	//gibt false zur�ck, wenn das L�schen nicht erfolgreich war
	public static boolean deletePerson(int personID) {
		return false;
	}
	
	//gibt alle Personen in einem Array zur�ck
	public static String[][] listAllPersons() {
		return person;
	}
}
