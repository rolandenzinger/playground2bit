package vaccination;

public class Person {
	private static String[][] person;
	
	
	//gibt die personID zurück
	public static int addNewPerson(String firstName, String lastName, int socialSecurityNumber, String street, int ZIP, String City, String Country, String Birthday, int Telephone) {
		String[][] temp = person;
		person = null;
		
		person = new String[temp.length + 1][10];
		for(int i = 0; i < temp.length; i++) {
			person[i] = temp[i];
		}
		
		person[temp.length][0] = firstName;
		return 0;
	}
	
	//gibt false zurück, wenn das Löschen nicht erfolgreich war
	public static boolean deletePerson(int personID) {
		say
		return false;
	}
	
	//gibt alle Personen in einem Array zurück
	public static String[][] listAllPersons() {
		return person;
	}
}
