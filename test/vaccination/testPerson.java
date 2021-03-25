package vaccination;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testPerson {

	@Test public void testAddNewPerson() {
		assertEquals(0, Person.addNewPerson("Maxi0", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
		assertEquals(1, Person.addNewPerson("Maxi1", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
		assertEquals(2, Person.addNewPerson("Maxi2", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
		assertEquals(3, Person.addNewPerson("Maxi3", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
		assertEquals(4, Person.addNewPerson("Maxi3", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
		assertEquals(5, Person.addNewPerson("Maxi3", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
		assertEquals(6, Person.addNewPerson("Maxi3", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
	}
	
	@Test public void testDeletePersons() {
		assertEquals(true, Person.deletePerson(0));
		assertEquals(true, Person.deletePerson(1));
		assertEquals(true, Person.deletePerson(2));
		
		assertEquals(false, Person.deletePerson(-1));
		assertEquals(false, Person.deletePerson(500));
		assertEquals(false, Person.deletePerson(-3));
	}	
	
	
	
	@Test public void listAllPersons() {
		String[][] test = new String[7][9];
		for (int i = 0; i < 3; i++) {
			test[i][0] = "";
			test[i][1] = "";
			test[i][2] = "";
			test[i][3] = "";
			test[i][4] = "";
			test[i][5] = "";
			test[i][6] = "";
			test[i][7] = "";
			test[i][8] = "";
		}
	
		for (int i = 0; i < test.length; i++) {
			
			test[i][0] = "Maxi" + i;
			test[i][1] = "Mustermann";
			test[i][2] = "123456789";
			test[i][3] = "Kastanienweg";
			test[i][4] = "8740";
			test[i][5] = "Weiﬂkirchen";
			test[i][6] = "Austria";
			test[i][7] = "12.12.20012";
			test[i][8] = "6801506";
		}
		
		assertEquals(test.length, Person.listAllPersons().length);
		
	}
	
}
