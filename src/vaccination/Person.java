package vaccination;

public class Person {

private static String[][] person = null;

	
	//gibt die personID zurück
	public static int addNewPerson(String firstName, String lastName, int socialSecurityNumber, String street, int ZIP, String City, String Country, String Birthday, int Telephone) {

		if (person == null) {
			person = new String[1][9];
			person[0][0] = firstName + "";
			person[0][1] =lastName + "";
			person[0][2] = socialSecurityNumber + "";
			person[0][3] = street + "";
			person[0][4] = ZIP + "";
			person[0][5] = City + "";
			person[0][6] = Country + "";
			person[0][7] = Birthday + "";
			person[0][8] = Telephone + "";
			return 0;
		}else {
			
			String[][] temp = person;
			person = null;
			
			person = new String[temp.length + 1][9];
			for(int i = 0; i < temp.length; i++) {
				person[i] = temp[i];
			}
			
			person[temp.length][0] = firstName + "";
			person[temp.length][1] =lastName + "";
			person[temp.length][2] = socialSecurityNumber + "";
			person[temp.length][3] = street + "";
			person[temp.length][4] = ZIP + "";
			person[temp.length][5] = City + "";
			person[temp.length][6] = Country + "";
			person[temp.length][7] = Birthday + "";
			person[temp.length][8] = Telephone + "";
			
			return person.length -1;
		}
	}
	
	//gibt false zurück, wenn das Löschen nicht erfolgreich war
	public static boolean deletePerson(int personID) {
		if (person.length > personID && personID >= 0) {
			person[personID][0] = "";
			person[personID][1] = "";
			person[personID][2] = "";
			person[personID][3] = "";
			person[personID][4] = "";
			person[personID][5] = "";
			person[personID][6] = "";
			person[personID][7] = "";
			person[personID][8] = "";
			return true;
		}else {
			return false;
		}
	}
	
	//gibt alle Personen in einem Array zurück
	public static String[][] listAllPersons() {
		return person;
	}
}
