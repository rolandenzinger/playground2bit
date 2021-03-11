package vaccination;

public class Person {
	private static String[][] person = null;
	
	
	//gibt die personID zur�ck
	public static int addNewPerson(String firstName, String lastName, int socialSecurityNumber, String street, int ZIP, String City, String Country, String Birthday, int Telephone) {
		if (person == null) {
			person = new String[1][10];
			person[0][0] = firstName + "";
			person[0][1] =lastName + "";
			person[0][2] = socialSecurityNumber + "";
			person[0][3] = street + "";
			person[0][4] = ZIP + "";
			person[0][5] = City + "";
			person[0][6] = Country + "";
			person[0][7] = Birthday + "";
			person[0][8] = Telephone + "";
		}
		
		String[][] temp = person;
		person = null;
		
		person = new String[temp.length + 1][10];
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
	
	//gibt false zur�ck, wenn das L�schen nicht erfolgreich war
	public static boolean deletePerson(int personID) {
		
		if(person[personID][0] != " ") {
			person[personID][0] = " ";
		} else {
			return false;
		}
		
		
		return true;
	}
	
	//gibt alle Personen in einem Array zur�ck
	public static String[][] listAllPersons() {
		return person;
	}
}
