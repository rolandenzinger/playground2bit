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
			if (personID == 0) {
				if (personID == person.length - 1) {
					person = null;
				}else {
					String[][] temp = person;
					person = null;
					person = new String[temp.length - 1][9];
					for (int i = 1; i < temp.length - 1;i ++) {
						person[i] = temp[i];
					}
				}
			}else if(personID == person.length - 1) {
				String[][] temp = person;
				person = null;
				String[][] person = new String[temp.length - 1][9];
				for (int i = 0; i < temp.length - 1; i ++) {
					person[i] = temp[i];
				}
			}else {
				String[][] temp = new String[personID + 1][9];
				for (int i = 0; i < personID; i++) {
					temp[i] = person[i];
				}
				String[][] temp2 = new String[person.length - 1 - personID][9];
				for (int i = personID + 1; i < person.length; i++) {
					temp2[i - personID - 1] = person[i];
				}
				person = null;
				person = new String[temp.length - 1 + temp2.length][9];
				for(int i = 0; i < (temp.length); i++) {
					person[i] = temp[i];
				}
				for(int i = personID; i < person.length; i++) {
					person[i] = temp2[i - personID];
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
	//gibt alle Personen in einem Array zurück
	public static String[][] listAllPersons() {
		System.out.println(person[0][0]);
		return person;
	}
}
